/**
 * Created by ADDY on 06/01/17.
 * src: https://www.hackerrank.com/challenges/funny-string
 */
import java.util.Scanner;
public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++){
            StringBuilder S = new StringBuilder(in.nextLine());
            StringBuilder SO = new StringBuilder(S);
            StringBuilder R = new StringBuilder(SO.reverse());
            boolean isFunny = true;
            for(int j=0;j<S.length()-1;j++){
                if(Math.abs(S.charAt(j+1) - S.charAt(j)) != Math.abs(R.charAt(j+1) - R.charAt(j))){
                    isFunny=false;
                    break;
                }
                else isFunny=true;
            }
            if(isFunny) System.out.println("Funny");
            else System.out.println("Not Funny");
        }
        in.close();
    }
}
