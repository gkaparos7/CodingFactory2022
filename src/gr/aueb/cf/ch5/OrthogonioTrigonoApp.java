package gr.aueb.cf.ch5;

import java.util.Scanner;

public class OrthogonioTrigonoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isOrtho = false;


        System.out.println("Please insert the 3 sides of the triangle (a,b,c)");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isOrtho = (Math.abs(a * a - (b * b + c * c)) <= EPSILON);

        if (isOrtho) {
            System.out.println("The triangle is orthogonio");
        } else {
            System.out.println("The triangle is not orthogonio");
        }

    }
}
