/**
 * Created by ADDY on 06/01/17.
 */
import java.util.Scanner;

public class TwoCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        StringBuilder s = new StringBuilder(in.next());
        System.out.println(s);
        String str = s.toString();
        str = str.replace("b","");
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            //if(str.charAt(i))
        }
    }
}
