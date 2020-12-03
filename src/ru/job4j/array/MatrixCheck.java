package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char i = ' '; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] != 'X') {
                    result = false;
                    break;
                }
            }
            return result;
        }
        return result;
    }
}