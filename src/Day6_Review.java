
/**
 * Created by ADDY on 05/01/17.
 */
import java.util.Scanner;
public class Day6_Review {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++){
            StringBuilder myString = new StringBuilder(in.nextLine());
            StringBuilder even = new StringBuilder("");
            StringBuilder odd = new StringBuilder("");
            for(int j=0;j<myString.length();j++){
                if(j%2 == 0) even.append(myString.charAt(j));
                else odd.append(myString.charAt(j));
            }
            System.out.printf("%s %s\n",even.toString(),odd.toString());
        }
    }
}
