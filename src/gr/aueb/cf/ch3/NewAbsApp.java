package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o triadikos telesths
 */
public class NewAbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please provide a number");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;

        System.out.printf("Absolute of %d is %d", num, abs);
    }
}
