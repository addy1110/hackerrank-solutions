/**
 * Created by ADDY on 06/01/17.
 */
import java.util.Scanner;
public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder messageSent = new StringBuilder(in.nextLine());
        int incorrectLetters=0;
        for(int i=0;i<messageSent.length();i=i+3){
            if(messageSent.charAt(i)!='S') incorrectLetters++;
            if(messageSent.charAt(i+1)!='O') incorrectLetters++;
            if(messageSent.charAt(i+2)!='S') incorrectLetters++;
        }
        System.out.println(incorrectLetters);
    }
}
