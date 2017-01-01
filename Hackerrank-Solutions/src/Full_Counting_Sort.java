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

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        try{
            n = Integer.parseInt(scan.readLine());
        }catch (IOException io){
            System.out.println("error reading the line ");
        }

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
                String temp = splitTemp[0]+" "+"-";
                myList.add(temp);

            }else{
                myList.add(listElement.toString());
            }

        }
        NumberFormat formatter = new DecimalFormat("#0.00000");
        long startTime = System.currentTimeMillis();

        myList.sort((String s1, String s2) -> Integer.parseInt(s1.split(" ")[0]) - Integer.parseInt(s2.split(" ")[0]));
//        myList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                //String[] a1 = s1.split(" ");
//                //String[] a2 = s2.split(" ");
//                //return Integer.parseInt(a1[0]) - (Integer.parseInt(a2[0]));
//                return Integer.parseInt(s1.split(" ")[0]) - Integer.parseInt(s2.split(" ")[0]);
//            }
//        });
        long firstLoop = System.currentTimeMillis();

        StringBuffer finalAns = new StringBuffer(1000000);

//        Iterator<String> iterator = myList.iterator();
//        while (iterator.hasNext()){
//            String item = iterator.next().split(" ")[1]+" ";
//            finalAns.append(new StringBuilder(item));
//        }
        for(String item: myList){

            finalAns.append(new StringBuilder(item.split(" ")[1]+" "));
        }

        System.out.println(finalAns);

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();

        System.out.println("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");
        System.out.println("First Loop time " + formatter.format((firstLoop-startTime) / 1000d) + " seconds");
        System.out.println("Display Loop time " + formatter.format((endTime-firstLoop) / 1000d) + " seconds");


    }

}