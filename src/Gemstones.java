/**
 * Created by ADDY on 06/01/17.
 */
import java.util.*;
public class Gemstones {
    static Set<Character> getSet(String str){
        Set<Character> S1 = new HashSet<>();
        for(char c: str.toCharArray()){
            S1.add(c);
        }
        return S1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        Set<Character> S1 = getSet(str);
        for(int i=0;i<n-1;i++){
            String second = in.nextLine();
            Set<Character> S2 = getSet(second);
            S1.retainAll(S2);
        }

        System.out.println(S1.size());
    }
}
