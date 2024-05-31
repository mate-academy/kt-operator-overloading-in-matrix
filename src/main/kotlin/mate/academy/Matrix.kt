package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    // TODO: implement overloading operators for matrix addition and subtraction
    operator fun plus(other: Matrix): Matrix {
        val result: Matrix = Matrix(other.rows,other.cols)
        for (row in data.indices) {
            for (col in data[row].indices) {
                result[row, col] = this.data[row][col] + other.data[row][col]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        val result: Matrix = Matrix(other.rows,other.cols)
        for (row in data.indices) {
            for (col in data[row].indices) {
                result[row, col] = this.data[row][col] - other.data[row][col]
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
