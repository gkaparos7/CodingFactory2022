package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * apofasizei gia to an xionizei i vrexei
 * eksartomeno apo tin thermokrasia
 * o xristis dinei th thermokrasia
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.printf("Please insert temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.printf("Is snowing:" + isSnowing);
    }
}
