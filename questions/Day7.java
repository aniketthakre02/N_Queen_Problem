package questions;
import java.util.Scanner;

//tcs digital coding question series#1
//given a square matrix, calculate the absolute difference between the sums of its diagonal
public class Day7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0;
        int arr[][]=new int[n][n];
       for( i=0;i<arr.length;i++){
           for( j=0;j<arr[i].length;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       int sumL=0;
       int sumR=0;
       i=0;j=0;
       while(i!=n&&j!=n){
           sumL=sumL+arr[i][j];
           i++;
           j++;
       }
        i=0;j=n-1 ;
        while(i!=n&&j>=0){
            sumR=sumR+arr[i][j];
            i++;
            j--;
        }
        System.out.println(sumR);
        System.out.println(sumL);
        int difference=sumL-sumR;
        if(difference<0){
            difference*=-1;
        }
            System.out.println(difference);
    }
}
