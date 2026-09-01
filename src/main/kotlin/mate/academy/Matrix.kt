package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(other: Matrix) : Matrix {
        val res = Matrix(other.rows, other.cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                res.set(i, j, (this.get(i, j) + other.get(i, j)))
            }
        }
        return res
    }

    operator fun minus(other: Matrix) : Matrix {
        val res = Matrix(other.rows, other.cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                res.set(i, j, (this.get(i, j) - other.get(i, j)))
            }
        }
        return res
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
