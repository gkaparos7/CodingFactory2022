package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη 3 ακεραίους
 * τους μειώνει κατά 1
 * και τους εμφανίζει με την ίδια σειρά που δόθηκαν
 * αφήνοντας ένα κενά αναμεσά τους
 */

public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert 3 integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1 -= 1; //ή num1--
        num2 -= 1; //ή num2--
        num3 -= 1; //ή num3--

        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
