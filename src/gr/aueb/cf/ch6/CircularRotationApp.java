package gr.aueb.cf.ch6;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        arr = doCircularLeftShiftBy2(arr, 3);
        for (int item : arr) {
            System.out.println(item + " ");
        }
    }

    public static int[] doCircularRightShiftBy (int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;

    }
    // l = 6
    public static int[] doCircularLeftShiftBy2(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];
        for (int i = arr.length + offset - 1; i > offset - 1; i--) {
            rotated[(i - offset) % arr.length] = arr[i % arr.length];
        }
        return rotated;
    }
}
