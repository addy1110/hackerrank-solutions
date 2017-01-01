
import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 * Created by ADDY on 31/12/16.
 *
 */
public class Full_Counting_Sort{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
//        System.out.println("enter the list items:- ");

        List<String> myList = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            String listElement = scan.nextLine();
            myList.add(listElement);
        }




        for(int i=0;i<n/2;i++){
            String temp = myList.get(i);
            String[] splitTemp = temp.split(" ");
            temp = splitTemp[0]+" "+"-";
            myList.set(i, temp);
        }

//        List<String> myOriginalList = new ArrayList<>(myList);

        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] a1 = s1.split(" ");
                String[] a2 = s2.split(" ");
                return Integer.parseInt(a1[0]) - (Integer.parseInt(a2[0]));
            }
        });

//        System.out.println(myOriginalList);
//        System.out.println(myList);
        for(String item: myList){
            String[] ans = item.split(" ");
            System.out.print(ans[1]+" ");
        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((totalTime) / 1000d) + " seconds");


    }

}
