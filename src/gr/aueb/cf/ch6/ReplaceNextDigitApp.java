package gr.aueb.cf.ch6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * replaces all array digits with the next digit
 */
public class ReplaceNextDigitApp {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8};
        shiftNextDigitByOne(arr, 0);
        for (int item : arr) {
            System.out.println(item + " ");
        }

    }

    public static void shiftNextDigitByOne(int[] arr, int low) {
        if (arr == null || low < 0 || low > arr.length) return;

        for (int i = low; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

    }
}
