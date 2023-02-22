package javaPrimalityTest;

import java.io.*;
import java.math.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();

        if (n.length() <= 100) {
            BigInteger bigInteger = new BigInteger(n);
            boolean isPrime =bigInteger.isProbablePrime(1);
            if (isPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        bufferedReader.close();
    }
}
