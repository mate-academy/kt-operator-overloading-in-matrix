package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(otherMatrix: Matrix): Matrix {
        val matrix: Matrix = Matrix(otherMatrix.rows, otherMatrix.cols)
        for (r in 0 until otherMatrix.rows) {
            for (c in 0 until otherMatrix.cols) {
                matrix[r, c] = get(r, c) + otherMatrix[r, c]
            }
        }
        return matrix
    }

    operator fun minus(otherMatrix: Matrix): Matrix {
        val matrix: Matrix = Matrix(otherMatrix.rows, otherMatrix.cols)
        for (r in 0 until otherMatrix.rows) {
            for (c in 0 until otherMatrix.cols) {
                matrix[r, c] = get(r, c) - otherMatrix[r, c]
            }
        }
        return matrix
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
