package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }
    operator fun plus(incrementMatrix: Matrix): Matrix {
        require(rows == incrementMatrix.rows && cols == incrementMatrix.cols) {
            "Matrices must have the same dimensions"
        }

        val result = Matrix(rows, cols)

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i, j] = this[i, j] + incrementMatrix[i, j]
            }
        }

        return result
    }

    operator fun minus(decrementMatrix: Matrix): Matrix {
        require(rows == decrementMatrix.rows && cols == decrementMatrix.cols) {
            "Matrices must have the same dimensions"
        }

        val result = Matrix(rows, cols)

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i, j] = this[i, j] - decrementMatrix[i, j]
            }
        }

        return result
    }


    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
