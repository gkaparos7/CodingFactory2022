package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * rixno 2 zaria
 */
public class RandomTwoDiceApp {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die 1: %d, Die 2: %d", die1, die2);



    }
}
