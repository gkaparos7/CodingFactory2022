package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Μετατρέπει έναν ακέραιο από ευρώ σε δολλάρια
 *
 */
public class EuroToUsdConventerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 108;

        System.out.println("Please insert amount in euros");
        inputEuros = scanner.nextInt();

        //Εντολές
        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτύπωση Αποτελεσμάτων
        System.out.printf("%d Euros = %d USD, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
