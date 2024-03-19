# Operator Overloading in Matrix

In this task, you will enhance a `Matrix` class to support matrix addition and subtraction operations using operator overloading. 
The `Matrix` class is already provided with basic functionalities like getting and setting values of elements. 
Your task is to implement the addition and subtraction operations that allow for the manipulation of matrix data in a more intuitive way.

### What you already have?

- The `Matrix` class constructor takes two arguments: `rows` and `cols`, representing the number of rows and columns in the matrix, respectively.
- The matrix data is stored in a 2D array of integers.
- Use the provided `get` and `set` operators to access matrix elements.
- Overridden `toString` method could be used for easy printing of matrix contents.

### Task description

- **Implement operator overloading for addition (`+`) and subtraction (`-`) operations** within the `Matrix` class. These operations should return a new `Matrix` object representing the result of the operation.

### Example usage

Here's an example of how someone might use your enhanced `Matrix` class:

```kotlin
val matrix1 = Matrix(2, 2)
matrix1[0, 0] = 1
matrix1[0, 1] = 2
matrix1[1, 0] = 3
matrix1[1, 1] = 4

val matrix2 = Matrix(2, 2)
matrix2[0, 0] = 5
matrix2[0, 1] = 6
matrix2[1, 0] = 7
matrix2[1, 1] = 8

val sumMatrix = matrix1 + matrix2
val differenceMatrix = matrix1 - matrix2

println("Sum of Matrices:\n$sumMatrix")
println("Difference of Matrices:\n$differenceMatrix")
```
