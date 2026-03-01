package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(matrix: Matrix): Matrix {
        validateTwoMatrix(matrix)
        val result = Matrix(rows, cols)

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i, j] = this[i, j] + matrix[i, j]
            }
        }
        return result
    }

    operator fun minus(matrix: Matrix): Matrix {
        validateTwoMatrix(matrix)
        val result = Matrix(rows, cols)

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i, j] = this[i, j] - matrix[i, j]
            }
        }
        return result
    }

    private fun validateTwoMatrix(other: Matrix) {
        require(rows == other.rows && cols == other.cols) {
            "Matrices must have the same dimensions"
        }
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
