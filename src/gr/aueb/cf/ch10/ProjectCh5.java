package gr.aueb.cf.ch10;

import java.util.Scanner;

public class ProjectCh5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        String response = "";

        do {
            printMenu();
            response = getChoice();

            try {
                if (response.matches("[Qq]")) {
                    quit = true;
                } else  {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice");
            }
        } while (!quit);

    }

    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Horizontal stars");
        System.out.println("2. Vertical stars");
        System.out.println("3. HV stars");
        System.out.println("4. HV Ascending stars");
        System.out.println("5. HV Descending stars");
        System.out.println("Q or q to Quit");
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }

    public static void printOnChoice(String s) throws IllegalArgumentException {
        int choice = -1;
        int n = 0;

        try {
            if (s == null) throw new IllegalArgumentException();

            choice = Integer.parseInt(s);
            if (choice >= 1 && choice <= 5) {
                System.out.println("Please insert the number of stars");
                n = Integer.parseInt(getChoice());
            }

            switch (choice) {
                case 1:
                    printStarsHori(n);
                    break;
                case 2:
                    printStarsVerti(n);
                    break;
                case 3:
                    printStarsHV(n);
                    break;
                case 4:
                    printStarsAsc(n);
                    break;
                case 5:
                    printStarsDesc(n);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printStarsHori(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
    public static void printStarsVerti(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsHori(n);
            System.out.println();
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsHori(i);
            System.out.println();
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsHori(i);
            System.out.println();
        }
    }
}
