# Sudoku Validator

## Description

The **Sudoku Validator** is a simple Java program that checks whether a given Sudoku solution is valid. It verifies if
the solution adheres to the rules of Sudoku:

1. Each row must contain the digits 1-9 without repetition.
2. Each column must also contain the digits 1-9 without repetition.
3. Each of the nine 3x3 sub-grids (also known as boxes) must contain the digits 1-9 without repetition.

## Usage

1. Compile the Java source code (if not already compiled):

```shell
javac SudokuValidator.java
```

2. Run the program, providing the Sudoku solution as input (a 9x9 grid represented as a 2D array):

```shell
java SudokuValidator
```

3. The program will output whether the solution is valid or not.

## Example

Input (sample Sudoku solution):
```shell
8 5 9 |6 1 2 |4 3 7
7 2 3 |8 5 4 |1 6 9
1 6 4 |3 7 9 |5 2 8
------+------+------
9 8 6 |1 4 7 |3 5 2
3 7 5 |2 6 8 |9 1 4
2 4 1 |5 9 3 |7 8 6
------+------+------
4 3 2 |9 8 1 |6 7 5
6 1 7 |4 2 5 |8 9 3
5 9 8 |7 3 6 |2 4 1

```


Output:

Valid Sudoku solution!

