package gr.aueb.cf.ch6;

public class IntArraySearch {

    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1, 5, 7, 9, 12};
        boolean isSecretFound = false;

        for (int item : arr) {
            if (item == SECRET) {
                isSecretFound = true;
                break;
            }
        }

        if(isSecretFound) {
            System.out.println("The secret key is found...!!!");
        } else {
            System.out.println("The secret key was not found :( ");
        }

    }
}
