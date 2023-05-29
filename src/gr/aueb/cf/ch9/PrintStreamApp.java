package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * prints with printstream
 */
public class PrintStreamApp {

    public static void main(String[] args) throws IOException {
        try (PrintStream ps = new PrintStream("C:/tmp/f1.txt", StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory, Γεια!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
