package mate.academy

class Matrix(private val rows: Int, private val cols: Int) {
    private val data = Array(rows) { IntArray(cols) }

    operator fun get(row: Int, col: Int): Int = data[row][col]
    operator fun set(row: Int, col: Int, value: Int) {
        data[row][col] = value
    }

    operator fun plus(matrix: Matrix): Matrix {
        val newMatrix = Matrix(this.rows, this.cols)
        for (rowNum in 0 until matrix.data.size) {
            for (columnNum in 0 until matrix.data[0].size) {
                newMatrix.set(
                    row = rowNum,
                    col = columnNum,
                    value = get(rowNum, columnNum) + matrix.get(rowNum, columnNum))
            }
        }
        return newMatrix
    }

    operator fun minus(matrix: Matrix): Matrix {
        val newMatrix = Matrix(this.rows, this.cols)
        for (rowNum in 0 until matrix.data.size) {
            for (columnNum in 0 until matrix.data[0].size) {
                newMatrix.set(
                    row = rowNum,
                    col = columnNum,
                    value = get(rowNum, columnNum) - matrix.get(rowNum, columnNum))
            }
        }
        return newMatrix
    }

    override fun toString(): String {
        return data.joinToString(separator = "\n") { row -> row.joinToString(" ") }
    }
}
