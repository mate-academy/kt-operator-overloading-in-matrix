package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(other: Matrix): Matrix {

        require(rows == other.rows && cols == other.rows)
        { "Matrices must have the same dimensions" }

        val result = Matrix(rows, cols)
        data.indices.forEach { i ->
            data[i].indices.forEach { j ->
                result.data[i][j] = this[i, j] + other[i, j]
            }
        }
        return result

    }

    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.rows)
        { "Matrices must have the same dimensions" }

        val result = Matrix(rows, cols)
        data.indices.forEach { i ->
            data[i].indices.forEach { j ->
                result.data[i][j] = this[i, j] - other[i, j]
            }
        }
        return result
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
