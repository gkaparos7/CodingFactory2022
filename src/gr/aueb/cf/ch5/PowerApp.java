package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * upologizei to a eis thn n
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;

        System.out.println("please write a number \"a\" and it's power \"b\"");
        a = in.nextInt();
        b = in.nextInt();

        System.out.println(power(a, b));
    }

    /**
     * Returns the power of
     *
     * @param a the base
     * @param b the power to raise
     * @return the power of a^b
     */
    public static int power(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}
