package gr.aueb.cf.ch5;

/**
 * Ypologizei to a^b anadromika
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {

        System.out.println(power(2, -4));

    }

    /**
     * Recursive a^b
     * @param a the base
     * @param b the power
     * @return a^b
     */
    public static float power(float a, float b) {
        if (b < 0) return 1 / power(a, Math.abs(b));
        if (b == 0) return 1;
        return a * power(a, b-1);
    }

}
