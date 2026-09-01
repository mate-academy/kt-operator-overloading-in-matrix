package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(other: Matrix): Matrix {
        val result = Matrix(this.rows, this.cols)
        data.forEachIndexed { xIndex, rows ->
            rows.forEachIndexed { yIndex, firstVal ->
                result[xIndex, yIndex] = firstVal + other[xIndex, yIndex]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Matrix(this.rows, this.cols)
        data.forEachIndexed { xIndex, rows ->
            rows.forEachIndexed { yIndex, firstVal ->
                result[xIndex, yIndex] = firstVal - other[xIndex, yIndex]
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
