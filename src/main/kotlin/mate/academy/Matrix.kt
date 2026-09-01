package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(other: Matrix) : Matrix {
        val resultMatrix = Matrix(rows, cols)
            for (r in 0 until rows) {
                for (c in 0 until cols) {
                    resultMatrix[r, c] = data[r][c] + other[r, c]
                }
            }
        return resultMatrix
    }

    operator fun minus (other: Matrix) : Matrix {
        val resultMatrix = Matrix(rows, cols)
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                resultMatrix[r, c] = data[r][c] - other[r, c]
            }
        }
        return resultMatrix
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
