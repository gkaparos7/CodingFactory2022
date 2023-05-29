package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WritterAp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/test1.txt");
                PrintWriter pw = new PrintWriter("C:/tmp/test2.txt")) {
            ps.println("Hello Coding Factory from print stream");
            pw.println("Hello Coding Factory from print writer");
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}
