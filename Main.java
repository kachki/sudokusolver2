import edu.princeton.cs.algs4.StdDraw;
import tileengine.TERenderer;
import tileengine.TETile;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        menu();
        String input = getUserInput();
        System.out.print("ho");
        if (input.equals("D") || input.equals("d")) {
            System.out.print("ho");
            SudokuSolver.runSolver();
        }

    }

    private static void menu() {

        StdDraw.text(0.5, 0.6, "Main Menu");
        StdDraw.text(0.5, 0.5, "Demo (D)");
        StdDraw.text(0.5, 0.4, "New Solve (L)");
        StdDraw.show();
    }

    private static String getUserInput() {
        StringBuilder input = new StringBuilder();
        System.out.print("ho1");
        SudokuSolver.runSolver();
        while (true) {
            if (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();
                if (key == 'd' || key == 'D') {
                    input.append(key);
                }
            }
        }
    }

}



