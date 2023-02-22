package bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.length() <= 200 && a.length() > 0 && b.length() <= 200 && b.length() > 0) {
            BigInteger bgA = new BigInteger(a);
            BigInteger bgB = new BigInteger(b);
            System.out.println(bgA.add(bgB) + "\n" + bgB.multiply(bgA));
        }
        scanner.close();
    }
}