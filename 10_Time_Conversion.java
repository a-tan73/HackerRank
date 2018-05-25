import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String ap = s.substring(8, 10);
        int hh = Integer.parseInt(s.substring(0, 2));
        String hhs = "";
        if (ap.equals("PM")) {
            if (hh != 12)
                hh += 12;
            hhs = Integer.toString(hh);
        } else if (ap.equals("AM")) {
            hhs = Integer.toString(hh);
            if (hh == 12) {
                hhs = "00";
            } else if (hh < 10) {
                hhs = "0" + hhs;
            }
        }
        return hhs + s.substring(2, 8);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
