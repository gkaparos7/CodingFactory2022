package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * prosthetei kai pollaplasiazei
 * n protous akeraious
 * to n to dinei o xrhsths
 */
public class AddMulApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a number");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
            result *= i;
        }

        System.out.println("sum: " + sum);
        System.out.println("mul: " + result);
        System.out.printf("Mul: %,d", result);
    }
}
