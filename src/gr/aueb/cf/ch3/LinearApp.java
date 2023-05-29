package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LinearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 17;

        while (true) {
            System.out.println("Provide the secret number");
            num = in.nextInt();

            if (num != SECRET) {
                System.out.println("Please try again");
                continue;
            }

            System.out.println("Bingooooo!!!!");
            break;

        }

    }
}