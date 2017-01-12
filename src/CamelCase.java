/**
 * Created by ADDY on 06/01/17.
 * src:
 */
import java.util.Scanner;
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.next());
        int m=0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) m++;
        }
        System.out.println(m+1);
    }
}
