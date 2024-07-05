package tileengine;

import java.awt.*;

/**
 * Contains constant tile objects, to avoid having to remake the same tiles in different parts of
 * the code.
 *
 * You are free to (and encouraged to) create and add your own tiles to this file. This file will
 * be turned in with the rest of your code.
 *
 * Ex:
 *      world[x][y] = Tileset.FLOOR;
 *
 * The style checker may crash when you try to style check this file due to use of unicode
 * characters. This is OK.
 */

public class Tileset {

//        public static final TETile AVATAR = new TETile('@', Color.black, Color.yellow, "you", 0);
//        public static final TETile WALL = new TETile('█', Color.orange, Color.orange ,
//                "locked door", 7);
//        public static final TETile FLOOR = new TETile('▒', Color.yellow, Color.yellow, "sand", 9);
//        public static final TETile NOTHING = new TETile('≈', Color.blue, Color.cyan, "water", 5);
//        public static final TETile TREE = new TETile('♠', Color.green, Color.yellow, "tree", 11);


        public static final TETile AVATAR = new TETile('@', Color.white, Color.black, "p1");
         public static final TETile WALL = new TETile('#', new Color(216, 128, 128), Color.pink,
          "wall"); // og color is darkgray  // Color(128, 192, 128)
        public static final TETile FLOOR = new TETile('·', new Color(255, 255, 255), Color.black, "floor");
        public static final TETile NOTHING = new TETile(' ', Color.black, Color.black, "nothing");
         public static final TETile TREE = new TETile('♠', Color.green, Color.black, "tree");

        public static final TETile P2 = new TETile('&', Color.pink, Color.black, "p2");
        public static final TETile GRASS = new TETile('"', Color.green, Color.black, "grass");
        public static final TETile WATER = new TETile('≈', Color.blue, Color.black, "water");
        public static final TETile FLOWER = new TETile('❀', Color.magenta, Color.pink, "flower");
        public static final TETile LOCKED_DOOR = new TETile('█', Color.orange, Color.black,
                "locked door");
        public static final TETile UNLOCKED_DOOR = new TETile('▢', Color.orange, Color.black,
                "unlocked door");
        public static final TETile SAND = new TETile('▒', Color.yellow, Color.black, "sand"); // use this as wall
        public static final TETile MOUNTAIN = new TETile('▲', Color.gray, Color.black, "mountain");


        public static final TETile CELL = new TETile('█', Color.white, Color.black, "cell");
    }



