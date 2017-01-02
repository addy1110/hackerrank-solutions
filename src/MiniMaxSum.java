/**
 * Created by ADDY on 01/01/17.
 */

import java.util.*;


public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] myList = new long[5];
        for(int i=0;i<5;i++){
            myList[i] = in.nextLong();
        }
        Arrays.sort(myList);

        Long min = myList[0]+myList[1]+myList[2]+myList[3];
        Long max = min+myList[4]-myList[0];
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }
}
