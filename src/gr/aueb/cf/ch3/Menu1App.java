package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * emfanizei epanalhptika ena menu
 * mexri o xristis na epileksei eksodo
 */
public class Menu1App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή προιόντος");
            System.out.println("2. Διαγραφή προιόντος");
            System.out.println("3. Έξοδος από το πρόγραμμα");
            choice = in.nextInt();

        } while (choice != 3);
    }
}
