/**
 * Created by ADDY on 01/01/17.
 */

import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder time = new StringBuilder(scan.nextLine());
        String[] splittedTime = time.toString().split(":");
        int hh = Integer.parseInt(splittedTime[0]);
        StringBuilder newTime = new StringBuilder("");
        if(time.charAt(8) == 'P'){
            if(hh!=12){
                hh +=12;
                newTime.append(hh).append(":"+splittedTime[1]).append(":"+splittedTime[2]);
            }
            else{
                newTime = time;
            }
        }
        else if(time.charAt(8) == 'A'){
            if(hh == 12) {
                newTime.append("00").append(":"+splittedTime[1]).append(":"+splittedTime[2]);
            }
            else {
                newTime = time;
            }
        }


        newTime.setLength(newTime.length()-2);
        System.out.println(newTime.toString());
    }
}
