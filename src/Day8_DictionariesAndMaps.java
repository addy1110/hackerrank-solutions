/**
 * Created by ADDY on 09/01/17.
 */
import java.util.*;
public class Day8_DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> numDirectory = new HashMap<>(n);

        for (int i=0;i<n;i++){
            String[] splitted = in.nextLine().split(" ");
            numDirectory.put(splitted[0], Integer.parseInt(splitted[1]));
        }

        String s;
        while(true){
            s = in.nextLine();
            if(s.compareTo("")==0) break;
            else {
                if(numDirectory.containsKey(s)){
                    System.out.printf("%s=%d\n",s,numDirectory.get(s));
                }
                else System.out.println("Not found");
            }
        }
        in.close();
    }
}
