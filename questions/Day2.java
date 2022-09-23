package questions;

import java.util.Scanner;

public class Day2 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(NoOfPair(arr,k,n));

    }
    private static int NoOfPair(int[] arr, int k,int n) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]-arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
}
