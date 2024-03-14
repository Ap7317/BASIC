import java.util.Scanner;
import java.util.*;

public class TwoDarr{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the row of matrix=");
        int n=in.nextInt();
        System.out.print("Enter the coloumn of matrix=");
        int m=in.nextInt();
        int[][] arr1=new int[n][m];
        int[][] arr2=new int[n][m];
        int[][] arr=new int[n][m];
        System.out.println("Enter array 1 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter array 2 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("The Sum of matrix 1 and matrix 2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The Multiplication of matrix 1 and 2 is");
    }
}