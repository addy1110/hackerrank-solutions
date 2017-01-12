/**
 * Created by ADDY on 01/01/17.
 * src: https://www.hackerrank.com/challenges/countingsort4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;



public class Full_Counting_Sort_best {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        try{
            n = Integer.parseInt(scan.readLine());
        }catch (IOException io){
            System.out.println("error reading the line ");
        }
        int[] index = new int[n];
        String[][] myList = new String[100][10300];

        for(int i=0;i<n;i++){
            try{
                String[] splitted = scan.readLine().split(" ");
                int indexVal = Integer.parseInt(splitted[0]);
                if(i<n/2){
                    myList[indexVal][index[indexVal]] = "-";

                }else{
                    myList[indexVal][index[indexVal]] = splitted[1];
                }
                index[indexVal] +=1;
            }catch(IOException io){

                System.out.println("error reading the line ");

            }
        }

        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();
        StringBuilder finalAns = new StringBuilder("");
        for(int i=0;i<100;i++)
            if(i<n)
                for(int k=0;k<index[i];k++)
                    if(myList[i][k]!=null)
                        finalAns.append( new StringBuilder(myList[i][k]+" "));
                    else break;
        System.out.println(finalAns.toString());

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");


    }
}
