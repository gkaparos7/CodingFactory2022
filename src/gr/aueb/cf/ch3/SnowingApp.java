package gr.aueb.cf.ch3;

import java.util.Scanner;

/** apofasizei an xionizei i oxi, me vasi oxi mono th thermokrasia
 * alla kai to an vrexei...
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.printf("Please insert if it is raining(true/false)");
        isRaining = in.nextBoolean();

        System.out.printf("Please insert temperature(int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.printf("Is snowing:" + isSnowing);
    }
}
