package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SudokuReader {

    private String filePath;

    public SudokuReader(String filePath) {
        this.filePath = filePath;
    }

    public Character[][] readSudokuGrid() throws FileNotFoundException {
        List<Character[]> grid = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int row = 0;
            while ((line = reader.readLine()) != null) {
                if (row != 3 && row != 7) {
                    String sanitizedLine = line.replaceAll("[\\s|]", "");
                    Character[] rowValues = new Character[sanitizedLine.length()];
                    for (int i = 0; i < sanitizedLine.length(); i++) {
                        rowValues[i] = sanitizedLine.charAt(i);
                    }
                    grid.add(rowValues);
                }
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Character[][] sudokuGrid = new Character[grid.size()][];
        for (int i = 0; i < grid.size(); i++) {
            sudokuGrid[i] = grid.get(i);
        }
        return sudokuGrid;
    }

}
