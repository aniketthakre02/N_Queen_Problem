package questions;
import java.util.Scanner;
public class Day9 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[x];
        for( int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for( int i=0;i<arr.length;i++){
            int count2=0;
            int sum=0;
            while(sum<=k&&i< arr.length){
                sum=sum+arr[i];
                System.out.println(sum);

                    i++;
                count2++;
            }
            if(count2>count){
                count=count2;
            }
        }
        System.out.println(count);
    }
}
