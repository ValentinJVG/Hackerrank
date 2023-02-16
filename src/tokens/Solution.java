package tokens;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int n = 0;
        String temp = null;
        String[] array = s.split("[\\W]");
        if (s.length() >= 1 && s.length() <= 4 * Math.pow(10, 5) ) {
            for (int i = 0; i < array.length; i++) {
                n++;
            }
            System.out.println(n);
            for (String value : array) {
                System.out.println(value);
            }
        }
        scan.close();
    }
}

