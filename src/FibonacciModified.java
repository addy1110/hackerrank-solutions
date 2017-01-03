/**
 * Created by ADDY on 02/01/17.
 */
import java.math.BigInteger;
import java.util.Scanner;
public class FibonacciModified {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = BigInteger.valueOf(in.nextInt());
        BigInteger t2 = BigInteger.valueOf(in.nextInt());
        int n = in.nextInt();
        BigInteger tn = BigInteger.ZERO;

        for(int i=0;i<n-2;i++){
            BigInteger square = t2.pow(2);
            tn = t1.add(square);
            t1 = t2;
            t2 = tn;
        }
        System.out.println(tn);
    }
}
