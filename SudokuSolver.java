import edu.princeton.cs.algs4.StdDraw;
import tileengine.TERenderer;
import tileengine.TETile;

import java.awt.*;

import static edu.princeton.cs.algs4.StdDraw.isKeyPressed;

public class SudokuSolver {
    private static final int GRID_SIZE = 9;
    private static final TERenderer ter = new TERenderer();
    private static TETile[][] tiles;

    public static void runSolver() {
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };

        tiles = new TETile[GRID_SIZE][GRID_SIZE];
        ter.initialize(GRID_SIZE, GRID_SIZE);

        updateTiles(board);
        ter.renderFrame(tiles);

        if (solveSudoku(board)) {
            if (StdDraw.hasNextKeyTyped()){
                if (isKeyPressed('S')){
                    updateTiles(board);
                }
                char key = StdDraw.nextKeyTyped();
                if (key == 's' || key == 'S') {
                updateTiles(board);}
            }
            ter.renderFrame(tiles);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }

    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValidMove(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // Puzzle solved
    }

    private static boolean isValidMove(int[][] board, int row, int col, int num) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false; // Conflict found
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false; // Conflict found
                }
            }
        }

        return true; // No conflicts found
    }

    private static void updateTiles(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] != 0) {
                    tiles[row][col] = new TETile((char) ('0' + board[row][col]), Color.BLACK, Color.WHITE, "number");
                } else {
                    tiles[row][col] = new TETile('.', Color.LIGHT_GRAY, Color.WHITE, "empty");
                }
            }
        }
    }
}
