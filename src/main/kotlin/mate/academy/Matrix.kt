
package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]

    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(matrix: Matrix): Matrix {
        require(rows == matrix.rows && cols == matrix.cols) {
            "Matrices must have the same dimensions"
        }

        val result = Matrix(rows, cols)

        for (row in 0 until rows) {
            for (col in 0 until cols) {
                result[row, col] = this[row, col] + matrix[row, col]
            }
        }

        return result
    }

    operator fun minus(matrix: Matrix): Matrix {
        require(rows == matrix.rows && cols == matrix.cols) {
            "Matrices must have the same dimensions"
        }

        val result = Matrix(rows, cols)

        for (row in 0 until rows) {
            for (col in 0 until cols) {
                result[row, col] = this[row, col] - matrix[row, col]
            }
        }

        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") {
                row -> row.joinToString(" ")
        }
    }
}
