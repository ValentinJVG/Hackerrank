package tokens;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.

        String[] array = s.trim().split("[ !,?._'@]+");
        if (s.length() >= 1 && s.length() <= 4 * Math.pow(10, 5) ) {
            System.out.println(array.length);
            for (String value : array) {
                System.out.println(value);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}

