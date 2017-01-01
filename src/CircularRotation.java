
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
/**
 * Created by ADDY on 01/01/17.
 */
public class CircularRotation {



    public static void main(String[] args) {

        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int q=in.nextInt();
        int[] circularArray=new int[n];

        for(int i=0;i<n;i++)
            circularArray[i]=in.nextInt();

        for(int i=0;i<q;i++)
        {
            int idx=in.nextInt();
            if(idx-(k%n)>=0)
                System.out.println(circularArray[idx-(k%n)]);
            else
                System.out.println(circularArray[idx-(k%n)+circularArray.length]);
        }

        long endTime   = System.currentTimeMillis();long totalTime = endTime - startTime;

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");
    }
}
