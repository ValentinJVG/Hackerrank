package anagram;

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();
        if (a.length() == b.length()) {
            if (a.length() >= 1 && b.length() <= 50) {

                char temp;
                for (int i = 0; i < charA.length; i++) {
                    for (int j = i + 1; j < charA.length; j++) {
                        if (charA[j] < charA[i]) {
                            temp = charA[i];
                            charA[i] = charA[j];
                            charA[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < charB.length; i++) {
                    for (int j = i + 1; j < charB.length; j++) {
                        if (charB[j] < charB[i]) {
                            temp = charB[i];
                            charB[i] = charB[j];
                            charB[j] = temp;
                        }
                    }
                }
            }

        } else {
            return false;
        }
       for (int i = 0; i < charA.length; i++) {
           if (charA[i] != charB[i]) {
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}