package gr.aueb.cf.ch3;
/**
 * keeps reading until sentinel number is provided
 */

import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please provide a number");
        num = in.nextInt();

        while (num != 0) {
            iterations++;
            System.out.println("Please provide a number");
            num = in.nextInt();
        }

        System.out.printf("It was executed %d times", iterations);


    }
}
