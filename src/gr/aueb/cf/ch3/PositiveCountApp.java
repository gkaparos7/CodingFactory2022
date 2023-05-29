package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * metraei to plithos ton thetikon arithmon pou dinei o xristis
 */
public class PositiveCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please give a num");
        num = in.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Please give a num");
            num = in.nextInt();
        }

        System.out.printf("The count is %d", positiveCount);
    }
}
