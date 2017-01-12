/**
 * Created by ADDY on 06/01/17.
 * src: https://www.hackerrank.com/challenges/caesar-cipher-1
 */
import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        StringBuilder arr = new StringBuilder(in.nextLine());
        int k = in.nextInt()%26;
        in.close();
        for(int i=0;i<n;i++){
            int index = (int)arr.charAt(i)+k;
            if((int)arr.charAt(i)>=65 && (int)arr.charAt(i)<=90){

                if (index>90) index = index-26;
                arr.setCharAt(i,(char)(index)); //65-90
            }
            else if((int)arr.charAt(i)>=97 && (int)arr.charAt(i)<=122){
                if (index>122) index = index-26;
                arr.setCharAt(i,(char)(index));
            }

        }
        System.out.println(arr.toString());

    }
}
