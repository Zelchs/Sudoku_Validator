package org.example;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    public boolean isValidSudoku(Character[][] board) {

        for (int i = 0; i < 9; i++) {
            Character[] column = new Character[9];

            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            if (isInvalidUnit(board[i])) {
                return false;
            }
            if (isInvalidUnit(column)) {
                return false;
            }
        }

        Set<Character> set = new HashSet<>();
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                set.clear();
                for (int i = boxRow * 3; i < boxRow * 3 + 3; i++) {
                    for (int j = boxCol * 3; j < boxCol * 3 + 3; j++) {
                        Character digit = board[i][j];
                        if (digit != '0' && (!set.add(digit))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean isInvalidUnit(Character[] unit) {
        Set<Character> set = new HashSet<>();
        for (Character ch : unit) {
            if (ch != '0' && !Character.isDigit(ch)) {
                return true;
            }
            if (ch != '0' && !set.add(ch)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSudokuBoardComplete(Character[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '0') {
                    return false;
                }
            }
        }
        return true;
    }

}
