package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * ΜιΑ ΕΦΑΡΜΟΓΗ ΠΟΥ ΑΠΟΦΑΣΙΖΕΙ ΑΝ ΕΝΑΣ ΑΡΙΘΜΟΣ ΕΙΝΑΙ
 * ΑΡΤΙΟΣ Ή ΠΕΡΙΤΤΟΣ
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean isNumEven = false;

        System.out.println("Please insert a num");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isNumEven);

    }

    /**
     * Evaluates an int if it is even or not
     * @param n the number (int) to evaluate
     * @return true if even, false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
//        if (n % 2 ==0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
