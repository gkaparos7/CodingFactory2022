package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Diavazei ores lepta kai deutera apo ton xristi
 * kai ta metatrepei se deuterolepta
 */
public class SecondsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTES = 60;

        System.out.println("Please insert hours, minutes, seconds");
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTES + inputSeconds;

        System.out.printf(Locale.US,"%d Hours, %d Minutes, %d Seconds = %,d Total Seconds",
                inputHours, inputMinutes, inputSeconds, totalSeconds);

        System.out.printf(Locale.forLanguageTag("el"),"%d Hours, %d Minutes, %d Seconds = %,d Total Seconds",
                inputHours, inputMinutes, inputSeconds, totalSeconds);
    }
}