package mate.academy

const val ZERO = 0

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(other: Matrix): Matrix {
        if (other.rows != rows || other.cols != cols) {
            return Matrix(ZERO, ZERO)
        }
        val result = Matrix(rows, cols)
        for (i in ZERO until rows) {
            for (j in ZERO until cols) {
                val a = this.get(i, j)
                val b = other.get(i, j)
                result.set(i, j, a + b)
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        if (other.rows != rows || other.cols != cols) {
            return Matrix(ZERO, ZERO)
        }
        val result = Matrix(rows, cols)
        for (i in ZERO until rows) {
            for (j in ZERO until cols) {
                val a = this.get(i, j)
                val b = other.get(i, j)
                result.set(i, j, a - b)
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n")
        { row -> row.joinToString(" ") }
    }
}
