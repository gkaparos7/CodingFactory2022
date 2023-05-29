package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * diavazei ena char me tin
 * System.in.read()
 */
public class CharInputApp {

    public static void main(String[] args) throws IOException {
        char inputChar;

        System.out.println("Please insert an ASCII");
        inputChar = (char) System.in.read();

        System.out.println("char: " +inputChar);

    }
}
