/**
 * Created by ADDY on 06/01/17.
 */
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int length = n/2;
        if(n%2 !=0) length++;

        for(int i=0;i<length;i++){

            for(int j=i;j<n-i-1;j++){
                System.out.printf("%d ",arr[i][j]);
            }

            for(int k=i;k<n-i-1;k++){
                System.out.printf("%d ",arr[k][n-i-1]);
            }

            for(int l=n-i-1;l>i;l--){
                System.out.printf("%d ",arr[n-i-1][l]);
            }

            for(int m=n-i-1;m>i;m--){
                System.out.printf("%d ",arr[m][i]);
            }
        }
        if(n%2 != 0) System.out.printf("%d",arr[n/2][n/2]);

    }
}
