package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * se auth thn efarmogh to programma apofasizei
 * an tha anapsoun ta fota an vrexei kai
 * ena apo ta epomena 2, an einai skotadi i an trexoume(klm/h > 100)
 * tis times tiw lamvanoume apo ton xristi
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        boolean lightsOn = false;
        int speed = 0;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on:" + lightsOn);

    }
}
