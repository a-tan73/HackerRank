import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */
        int maxNum = ar[0];
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] > maxNum) {
                maxNum = ar[i];
            }
        }
        int cnt = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == maxNum){
                cnt++;
            }
        }
        return cnt;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
