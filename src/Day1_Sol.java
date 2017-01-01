/**
 * Created by ADDY on 31/12/16.
 */
import java.util.*;

public class Day1_Sol {
    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int myint = scan.nextInt();
        double myDouble = scan.nextDouble();
        scan.nextLine();
        String myString = scan.nextLine();
        scan.close();
        System.out.println(i+myint);
        System.out.println(d+myDouble);
        System.out.println(s+myString);

    }
}
