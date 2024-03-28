package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }
    operator fun plus(other: Matrix): Matrix {
        if (!(this.rows == other.rows && this.cols == other.cols)) {
            throw MatrixException("We can provide operation on equal Matrix only")
        }
        val resultMatrix = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultMatrix[i, j] = this[i, j] + other[i, j]
            }
        }
        return resultMatrix

    }

    operator fun minus(other: Matrix): Matrix {
        if (!(this.rows == other.rows && this.cols == other.cols)) {
            throw MatrixException("We can provide operation on equal Matrix only")
        }
        val resultMatrix = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultMatrix[i, j] = this[i, j] - other[i, j]
            }
        }
        return resultMatrix
    }
    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
