import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve(int year) {
        int day = 0;
        if (year % 4 == 0) {
            day = 12;
        } else {
            day = 13;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            if (year <= 1917)
                day = 12;
            else
                day = 13;
        }
        if (year == 1918)
            day = 26;
        return day + ".09." + year;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
