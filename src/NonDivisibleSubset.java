import java.util.*;

/**
 * Created by ADDY on 02/01/17.
 */
public class NonDivisibleSubset {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];

        List<Integer> getLargest = new ArrayList<>(n);
        List<Integer> remArray = new ArrayList<>(n);
        if(n == 1){
            int x = in.nextInt();
            if(k == 1) System.out.println(0);
            else if (k == x) System.out.println(0);
            else System.out.println(1);
        }
        else{
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
                int rem = a[i]%k;
                remArray.add(rem);
            }

            remArray.sort(Comparator.comparingInt(Integer::intValue));
            int previous = remArray.get(0);
            int m=0;
            int flag;
            System.out.println(remArray);
            for(int i: remArray){
                if(i == 0){
                    flag=1;
                    continue;
                }
                if(i == previous) m++;
                else{
                    getLargest.add(m);
                    m=1;
                }
                previous = i;
            }
            getLargest.add(m);
            System.out.println(getLargest);
            if(getLargest.contains(0)) System.out.println(Collections.max(getLargest)+1);
            else System.out.println(Collections.max(getLargest));
        }
    }
}
