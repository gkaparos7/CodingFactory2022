package gr.aueb.cf.ch3;

import java.util.Scanner;

/** o xristis dinei start, end kai step
 * kai ektyponei antistoixa asterakia
 */
public class StarsStepApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;


        System.out.println("Please insert start, end, step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        i = start;
        while (i <= end) {
            System.out.print("*");
            i = i +step;
        }
    }
}
