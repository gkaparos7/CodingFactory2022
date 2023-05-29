package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * diavazei enan char me Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        System.out.println("Please insert a char");
        inputChar = in.next().charAt(6);

        System.out.println("char: " +inputChar);
    }
}
