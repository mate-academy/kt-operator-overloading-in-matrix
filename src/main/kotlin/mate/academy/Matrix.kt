package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(other: Matrix): Matrix {
        val result = Matrix(this.rows, this.cols)
        for (x: Int in 0 until this.data.size step 1) {
            for (y: Int in 0 until this.data.size step 1) {
                result[x, y] = this[x, y] + other[x, y]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Matrix(this.rows, this.cols)
        for (x: Int in 0 until this.data.size step 1) {
            for (y: Int in 0 until this.data.size step 1) {
                result[x, y] = this[x, y] - other[x, y]
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
