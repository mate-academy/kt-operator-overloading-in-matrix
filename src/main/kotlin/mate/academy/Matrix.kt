package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must match for addition"
        }
        val result = Matrix(rows, cols)
        for (row in 0 until rows) {
            for (col in 0 until cols) {
                result[row, col] = this[row, col] + other[row, col]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) {
            "Matrix dimensions must match for subtraction"
        }
        val result = Matrix(rows, cols)
        for (row in 0 until rows) {
            for (col in 0 until cols) {
                result[row, col] = this[row, col] - other[row, col]
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
