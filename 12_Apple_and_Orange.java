import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int anum = 0;
        int onum = 0;
        for(int i = 0; i < apples.length; i++) {
            if(s <= (a + apples[i]) && t >= (a + apples[i])) {
                anum ++;
            }
        }
        for(int i = 0; i < oranges.length; i++) {
            if(s <= (b + oranges[i]) && t >= (b + oranges[i])) {
                onum ++;   
            }
        }
        System.out.println(anum);
        System.out.println(onum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apple = new int[m];

        String[] appleItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int appleItem = Integer.parseInt(appleItems[i]);
            apple[i] = appleItem;
        }

        int[] orange = new int[n];

        String[] orangeItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangeItem = Integer.parseInt(orangeItems[i]);
            orange[i] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b, apple, orange);

        scanner.close();
    }
}
