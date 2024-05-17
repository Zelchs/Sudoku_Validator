package org.example;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        //Replace with specific file name
        final String FILE_PATH = "src/main/resources/sudokuBoards/invalid_due_to_subgroup_dupe.sudoku";

        SudokuReader sudokuReader = new SudokuReader(FILE_PATH);
        SudokuValidator sudokuValidator = new SudokuValidator();

        try {
            Character[][] sudokuGrid = sudokuReader.readSudokuGrid();

            if (sudokuValidator.isValidSudoku(sudokuGrid)) {
                System.out.println("Sudoku grid is valid!");
                if (sudokuValidator.isSudokuBoardComplete(sudokuGrid)) {
                    System.out.println("Sudoku game completed");
                } else {
                    System.out.println("Sudoku game is valid but not yet complete");
                }
            } else {
                System.out.println("Sudoku grid is invalid");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

    }
}