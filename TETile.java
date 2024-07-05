package tileengine;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.Color;
import edu.princeton.cs.algs4.StdDraw;

public class TETile {
    private final char character;
    private final Color textColor;
    private final Color backgroundColor;
    private final String description;

    public TETile(char character, Color textColor, Color backgroundColor, String description) {
        this.character = character;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.description = description;
    }

    public void draw(int x, int y) {
        StdDraw.setPenColor(backgroundColor);
        StdDraw.filledSquare(x + 0.5, y + 0.5, 0.5);
        StdDraw.setPenColor(textColor);
        StdDraw.text(x + 0.5, y + 0.5, String.valueOf(character));
    }
}

