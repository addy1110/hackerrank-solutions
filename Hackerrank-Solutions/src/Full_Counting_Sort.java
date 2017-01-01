import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.io.*;

/**
 * Created by ADDY on 31/12/16.
 *
 */
public class Full_Counting_Sort{
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        try{
            n = Integer.parseInt(scan.readLine());
        }catch (IOException io){
            System.out.println("error reading the line ");
        }
//        System.out.println("enter the list items:- ");

        List<String> myList = new ArrayList<>(n);
        StringBuilder listElement = new StringBuilder();
        for(int i=0;i<n;i++){
            try{
                listElement = new StringBuilder(scan.readLine());

            }catch(IOException io){

                System.out.println("error reading the line ");
            }
            if(i<n/2){
                String[] splitTemp = listElement.toString().split(" ");
                StringBuilder temp = new StringBuilder(splitTemp[0]+" "+"-");
                myList.add(temp.toString());

            }else{
                myList.add(listElement.toString());
            }

        }
        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        Collections.sort(myList, (String s1, String s2) -> Integer.parseInt(s1.split(" ")[0]) - Integer.parseInt(s2.split(" ")[0]));
        long firstLoop = System.currentTimeMillis();

//        System.out.println(myOriginalList);
//        System.out.println(myList);
        StringBuilder finalAns = new StringBuilder();
        for(String item: myList){
            String[] ans = item.split(" ");
            finalAns.append(ans[1]+" ");
        }
        System.out.println(finalAns);
        /*for(int i=0;i<n;i++){
            String[] ans = (new StringBuilder(myList.get(i))).toString().split(" ");
            System.out.print(ans[1]+" ");
        }*/
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");
        System.out.println("First Loop time " + formatter.format((firstLoop-startTime) / 1000d) + " seconds");
        System.out.println("Display Loop time " + formatter.format((endTime-firstLoop) / 1000d) + " seconds");


    }

}