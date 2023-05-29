package gr.aueb.cf.ch6;

/**
 * Dilosi kai arhikopoihsh pinaka.
 */
public class PopulateArrayApp {

    public static void main(String[] args) {
        //dilosi kai arhikopoihsh pinaka me length
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
        for (int elem : arr) {
            System.out.println(elem + " ");
        }

        //unsized initialization
        int[] arr2 = {1, 5, 8, 9, 12};

        //array initializer
        int[] arr3 = new int[] {4, 6, 9, 10};


    }
}
