/**
 * Created by ADDY on 05/01/17.
 */
import java.util.Scanner;
public class Day5_Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<11;i++){
            System.out.printf("%d x %d = %d\n", n,i,i*n);
        }
    }
}
