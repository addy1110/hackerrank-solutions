/**
 * Created by ADDY on 01/01/17.
 */
import java.util.*;

public class Day2_Operators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost+(tipPercent*mealCost/100)+(taxPercent*mealCost)/100);
        System.out.printf("The total meal cost is %d dollars.", totalCost);

        // Print your result
    }
}
