package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * o xristis dinei 2 akeraious kai to programma ypologizei ta +, -, *, / %
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please insert 2 integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Sub: " + (num1 - num2));
        System.out.println("Mul: " + (num1 * num2));
        System.out.println("Div: " + (num1 / num2));
        System.out.println("Mod: " + (num1 % num2));
    }
}
