package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * o xrhsths exei 10 eukairies
 * gia na vrei ena mustiko kleidi,
 * an to vrei noritera apo thn dekath fora
 * h for tha prepei na stamathsei
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num = 0;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please make a guess");
            num = in.nextInt();
            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No worries, try again!!!");
            System.exit(1);
        }
        System.out.println("Success!!!! Play again!!!");
    }
}
