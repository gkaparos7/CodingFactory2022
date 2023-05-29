package gr.aueb.cf.ch8;

import java.io.IOException;

public class Except2App {

    public static void main(String[] args) {
        try {
            int ch = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
