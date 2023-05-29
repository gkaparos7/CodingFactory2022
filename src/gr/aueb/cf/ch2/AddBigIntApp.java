package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class AddBigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("2147483647");
        BigInteger bigNum2 = new BigInteger("2147483647");
        BigInteger result1 = new BigInteger("0");

        result1 = bigNum.add(bigNum2);

        System.out.printf("%d", result1);
    }
}
