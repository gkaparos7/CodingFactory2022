package gr.aueb.cf.ch6;

public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] grades = {5, 6, 4, 3, 9};
        upscaleByOne(grades);
        printArray(grades);
    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
