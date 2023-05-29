package gr.aueb.cf.ch6;

/**
 * ektyponei ena pinaka me th xrhsh methodou
 */
public class PrintArrayMethod {

    public static void main(String[] args) {
        int[] ages = {18, 24, 56, 32};
        printArray(ages);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
