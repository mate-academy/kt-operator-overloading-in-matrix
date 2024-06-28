package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(another: Matrix): Matrix {
        require(rows == another.rows && cols == another.cols) {
            "Matrices must have equal dimensions for addition"
        }

        val result = Matrix(rows, cols)

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i, j] = this[i, j] + another[i, j]
            }
        }
        return result
    }

    operator fun minus(another: Matrix): Matrix {
        require(rows == another.rows && cols == another.cols) {
            "Matrices must have equal dimensions for subtraction"
        }

        val result = Matrix(rows, cols)

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i, j] = this[i, j] - another[i, j]
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
