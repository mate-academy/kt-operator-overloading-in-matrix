package mate.academy

const val ZERO = 0

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(otherMatrix: Matrix): Matrix {
        val result = Matrix(data.size, data[ZERO].size)
        for (row in data.indices) {
            for (col in ZERO until data[ZERO].size) {
                result[row, col] = get(row, col) + otherMatrix[row, col]
            }
        }
        return result
    }

    operator fun minus(otherMatrix: Matrix): Matrix {
        val result = Matrix(data.size, data[ZERO].size)
        for (row in data.indices) {
            for (col in ZERO until data[ZERO].size) {
                result[row, col] = get(row, col) - otherMatrix[row, col]
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
