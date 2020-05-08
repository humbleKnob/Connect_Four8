//public class Computer extends Player {
//
//    public Computer(String token) {
//
//        super("Bit Bucket", token);
//    }
//
//    //************ ALGORITHM #4 ***************
//    // very basic random move algorithm for now
//    // how should the computer decide how to move?
//    public int determineMove() {
//
//
//        int col = (int) (Math.random() * 8);
//        return col;
//
//    }
//}

import java.util.Random;

public class Computer {

    String token = " O ";

    public Computer() {}

    //computer always makes a ranom move - very sophisticated
    public int determineMove(Board b) {

        return (int)(Math.random() * ((7-0) + 1));

    }

}