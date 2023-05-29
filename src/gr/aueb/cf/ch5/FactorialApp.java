package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * upologizoume to paragontiko n
 * me thn methodo facto
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        n = in.nextInt();
        System.out.printf("The factorial of %d is %d",n, facto(n));
    }

    public static int facto(int n) {
        int paragontiko = 1;
        for (int i = 1; i <= n; i++) {
            paragontiko *= i;
        }
        return paragontiko;
    }

}
