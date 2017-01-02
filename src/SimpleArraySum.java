/**
 * Created by ADDY on 02/01/17.
 */
import java.util.Scanner;
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        int sum=0;
        for(int i=0;i<n;i++){
            sum += in.nextInt();
        }
        System.out.println(sum);

    }
}
