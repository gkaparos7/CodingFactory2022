package gr.aueb.cf.ch2;

public class AddApp {
    public static void main(String[] args) {
        long num1 = 2_147_483_647;
        int num2 = 2;
        long result = 0;

        result = num1 + num2;

        System.out.printf("Sum: %d", result);
    }
}
