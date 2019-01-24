package jan_23.evidences;

import java.math.BigInteger;

public class IsPrime {

    public static void main(String[] args) {
        checkPrime(1, 10);
    }

    public static void checkPrime(int n1, int n2) {
        while (n1 <= n2) {
            if (isPrime(n1)) {
                System.out.println(n1 + " is " + " prime");
            }
            n1++;
        }
    }

    public static boolean isPrime(int num) {
        boolean prime = false;
        if (new BigInteger(String.valueOf(num)).isProbablePrime(num)) {
            prime = true;
        }
        return prime;
    }

}
