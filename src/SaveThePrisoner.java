/**
 * Created by ADDY on 01/01/17.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class SaveThePrisoner {
    public static void main(String[] args) {
        NumberFormat formatter = null;
        long startTime = 0;
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        in.nextLine();
        long ans = 0;
        for(int i=0;i<numberOfTestCases;i++){
            long numberOfPrisoners = in.nextLong();
            long numberOfSweets = in.nextLong();
            long prisonerID = in.nextLong();
            formatter = new DecimalFormat("#0.00000");
            startTime = System.currentTimeMillis();
            if(numberOfSweets>numberOfPrisoners){
                ans = numberOfSweets%numberOfPrisoners + prisonerID -1;
                if(ans>numberOfPrisoners) System.out.println(ans%numberOfPrisoners);
                else System.out.println(ans);
            }
            else if(numberOfSweets<=numberOfPrisoners){
                System.out.println(numberOfSweets+prisonerID-1);
            }

        }
        long endTime   = System.currentTimeMillis();long totalTime = endTime - startTime;

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");
    }
}
