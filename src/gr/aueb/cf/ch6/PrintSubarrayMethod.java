package gr.aueb.cf.ch6;

/**
 * print subarray me overload
 */
public class PrintSubarrayMethod {

    public static void main(String[] args) {
            int[] ages = {18, 24, 56, 32};
            printArray(ages);
            printArray(ages, 1, 3);
        }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        low -= 1;
        high -= 1;
        if (arr == null) return;
        if (low < 0 || high > arr.length - 1) return;

        for (int i = low; i <= high; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
