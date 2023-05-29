package gr.aueb.cf.ch6;

/**
 * anazita to elaxisto kai to megisto se ena pinaka
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {

        int[] arr = {30, 12, 80, 7, 15};
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value: %d and min position: %d", minValue, minPosition + 1);
    }
}
