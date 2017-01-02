import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;


/**
 * Created by ADDY on 01/01/17.
 */
public class StairCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        int number = n;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            String original = "";
            String hashTag  = "";
            char c = ' ';
            number--;
            char[] repeat = new char[number];
            char[] hashR = new char[i+1];
            Arrays.fill(repeat, c);
            Arrays.fill(hashR, '#');
            original += new String(repeat);
            hashTag += new String(hashR);

            System.out.println(original+hashTag);


        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");
    }
}
