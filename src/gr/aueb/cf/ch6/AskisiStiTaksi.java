package gr.aueb.cf.ch6;

import java.util.Arrays;

public class AskisiStiTaksi {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        int missing = 0;

        missing = getMissing(arr);
        System.out.println(missing);

    }

    public static int getMissing(int[] arr) {
        int[] arr2 = new int[arr.length + 1];
        for (int k = 0; arr2.length > k; k++) {
            arr2[k] = k + 1;
        }

        int sum1 = 0;
        int sum2 = 0;
        int missing = 0;


        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }

        for (int j = 0; j < arr.length; j++) {
            sum1 += arr[j];
        }

        missing = sum2 - sum1;
        return missing;
    }
}

