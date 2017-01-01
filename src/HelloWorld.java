/**
 * Created by ADDY on 27/12/16.
 */
import java.util.*;

public class HelloWorld {

    public static int getSum(ArrayList<Integer> myArray){
        int sum=0;
        for(int i : myArray){
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args){
//        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String inputArray = scanner.nextLine();
        scanner.close();

        System.out.println("Input String is: " + inputString);
        String[] params = inputString.split(" ");
//        System.out.println(Integer.parseInt(params[0]));
        int m = Integer.parseInt(params[0]);
        int r = Integer.parseInt(params[1]);
        int s = Integer.parseInt(params[2]);
        System.out.println("params are :-");
        System.out.println(m);
        System.out.println(r);
        System.out.println(s);
        System.out.println(inputArray);

        String[] myArray = inputArray.split(" ");

        ArrayList<Integer> myIntArray = new ArrayList<>(m);
        for(String i : myArray) {
            myIntArray.add(Integer.parseInt(i));

        }
        System.out.printf("length :");
        System.out.println(myIntArray.size());
        System.out.println(myIntArray);
        int sum  = getSum(myIntArray);
        System.out.println(sum);
        int count = 0;
        /*for (int i=0;i<myIntArray.size()-1;i++) {
            for (int j = i+1; j < myIntArray.size(); j++) {
                System.out.print(myIntArray.get(i));
                System.out.print(" ");
                System.out.println(myIntArray.get(j));
                ArrayList<Integer> a = new ArrayList<>(1);
                ArrayList<Integer> b = new ArrayList<>(1);
            }
        }*/

//        for (int i=0;i<myIntArray.size()-1;i++) {
//            for (int j = i; j < myIntArray.size(); j++) {
//                if (myIntArray.get(i) + myIntArray.get(j) == r && Math.abs(myIntArray.get(i) - myIntArray.get(j)) == s) {
//                    count += 1;
//                    System.out.println(myIntArray.get(i));
//                    System.out.println(myIntArray.get(j));
//                    System.out.println("done");
//                }
//            }
//        }
        System.out.println(count);
    }
}
