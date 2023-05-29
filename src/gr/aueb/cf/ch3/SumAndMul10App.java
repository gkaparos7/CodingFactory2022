package gr.aueb.cf.ch3;

/**
 * to athroisma kai to ginomeno ton 10 proton akeraion
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
