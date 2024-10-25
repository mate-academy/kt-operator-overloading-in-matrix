package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MatrixTest {

    @Test
    fun plus_TwoMatrices_CorrectlyAdded() {
        val matrix1 = Matrix(2, 2).apply {
            this[0, 0] = 1
            this[0, 1] = 2
            this[1, 0] = 3
            this[1, 1] = 4
        }
        val matrix2 = Matrix(2, 2).apply {
            this[0, 0] = 4
            this[0, 1] = 3
            this[1, 0] = 2
            this[1, 1] = 1
        }

        val result = matrix1 + matrix2

        assertEquals(5, result[0, 0], 
            "Result of addition is incorrect at [0,0].")
        assertEquals(5, result[0, 1], 
            "Result of addition is incorrect at [0,1].")
        assertEquals(5, result[1, 0], 
            "Result of addition is incorrect at [1,0].")
        assertEquals(5, result[1, 1], 
            "Result of addition is incorrect at [1,1].")
    }

    @Test
    fun minus_TwoMatrices_CorrectlySubtracted() {
        val matrix1 = Matrix(2, 2).apply {
            this[0, 0] = 5
            this[0, 1] = 5
            this[1, 0] = 5
            this[1, 1] = 5
        }
        val matrix2 = Matrix(2, 2).apply {
            this[0, 0] = 1
            this[0, 1] = 2
            this[1, 0] = 3
            this[1, 1] = 4
        }

        val result = matrix1 - matrix2

        assertEquals(4, result[0, 0], 
            "Result of subtraction is incorrect at [0,0].")
        assertEquals(3, result[0, 1], 
            "Result of subtraction is incorrect at [0,1].")
        assertEquals(2, result[1, 0], 
            "Result of subtraction is incorrect at [1,0].")
        assertEquals(1, result[1, 1], 
            "Result of subtraction is incorrect at [1,1].")
    }
}
