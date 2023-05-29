package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NparagontikoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;
        long factorial = 1L;

        System.out.println("Please insert the number to find it's factorial");
        n = in.nextInt();

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.printf("Factorial of %d is %,d", n, factorial);
    }
}

