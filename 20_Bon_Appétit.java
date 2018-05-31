import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] price = new int[n];
        String[] priceS = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(priceS[i]);
        }

        String[] billS = scanner.nextLine().split(" ");
        int bill = Integer.parseInt(billS[0]);

        String result = payBill(n, k, price, bill);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }

    static String payBill(int n, int k, int[] price, int bill) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != k)
                sum += price[i];
        }
        int result = bill - (sum / 2);
        String resultS = String.valueOf(result);
        if (result == 0) {
            resultS = "Bon Appetit";
        }
        return resultS;
    }
}