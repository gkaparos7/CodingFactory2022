package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * o xristis dinei ena n, kai vgazei orizontia n  sterakia
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int numberOfStars = 0;

        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        while (numberOfStars >= i) {
            System.out.print("*");
            i++;
            if (i % 50 == 0) {
                System.out.println();
            }
        }
    }
}
