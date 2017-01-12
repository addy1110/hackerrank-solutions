/**
 * Created by ADDY on 12/01/17.
 * src: https://www.hackerrank.com/challenges/30-recursion
 */
import java.util.Scanner;
class Day9_Recursion {
    static int factorial(int n){
        if(n<=1) return 1;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));


    }
}
