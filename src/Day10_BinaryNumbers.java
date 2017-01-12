/**
 * Created by ADDY on 12/01/17.
 * src: https://www.hackerrank.com/challenges/30-binary-numbers?h_r=next-challenge&h_v=zen
 */
import java.util.Scanner;
public class Day10_BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(number));
        int isBitOne=0, numOfConsecutiveBits=0;
        for(int i=0;i<binaryString.length();i++){
           if(binaryString.charAt(i) == '1'){
               isBitOne++;
           }
           else{
               isBitOne=0;
           }
            if(numOfConsecutiveBits<isBitOne) numOfConsecutiveBits=isBitOne;
        }
        System.out.println(numOfConsecutiveBits);

    }
}
