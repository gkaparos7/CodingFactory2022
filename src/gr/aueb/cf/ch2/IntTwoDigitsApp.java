package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * o xristis dinei ena dipsiphio akeraio kai upologizetai to athroisma ton 2 psiphion
 */
public class IntTwoDigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int leftDigit = 0;
        int rightDigit = 0;

        System.out.println("Please insert a two-digit integer");
        num = in.nextInt();
        rightDigit = num % 10;
        leftDigit = num / 10;
        sum = rightDigit + leftDigit;

        System.out.printf("%d + %d = %d", leftDigit, rightDigit, sum);
    }
}

