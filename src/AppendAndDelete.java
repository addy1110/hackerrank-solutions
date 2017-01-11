/**
 * Created by ADDY on 02/01/17.
 * src:https://www.hackerrank.com/challenges/append-and-delete
 */
import java.util.Scanner;
public class AppendAndDelete {

    static int checkMe(String s, String t, int k){
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);
        int len = s1.length() < t1.length() ? s1.length() : t1.length();
        int index = 0;
        for(int i=0;i<len;i++){
            if(s1.charAt(i) == t1.charAt(i)) index++;
            else break;
        }

        return index;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int k = in.nextInt();
        in.nextLine();

        if(s.compareTo(t) == 0){
            if(k%2 == 0 || k> 2*s.length()) System.out.println("Yes");
            else System.out.println("No");
        }
        else{
            int index = checkMe(s,t,k);
            System.out.printf("index %d\n", index);
            if(index == 0 && k>= (s.length()+t.length())){
                System.out.println("Yes");
            }
            else {
                StringBuilder s1 = new StringBuilder(s);
                StringBuilder t1 = new StringBuilder(t);
                String s2 = s1.substring(index, s1.length());
                String t2 = t1.substring(index, t1.length());
                int newIndex = checkMe(s2, t2, k);
               
                if(newIndex == 0 && k>= (s2.length()+t2.length()) && s2.length()!=0){
                    System.out.println("Yes");
                }else if(s2.length() == 0 && k>= (s2.length()+t2.length()) && t2.length()%2 == 0){
                    System.out.println("Yes");
                }
                else System.out.println("No");
            }

        }

    }
}
