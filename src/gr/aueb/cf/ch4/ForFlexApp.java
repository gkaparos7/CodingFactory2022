package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * diavazei apo stdin
 * start-value, end-value,step
 * kai ektuponei to plithos ton epanalipseon
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please insert a start value, an end value, a step and the number of iterations");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.println(i + " ");

        }

        System.out.println("Iterations: " + iterations);



    }
}
