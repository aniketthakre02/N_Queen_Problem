package questions;

import java.util.Scanner;

//pyramid with logic series
public class Day5 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int a,b,res;
        a=0;
        b=3;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                a=a+2;
                if(i==1){
                    b=3;
                }else{
                    b=b+4;
                }
                res=a*b;
                int count=0;
                int temp=res;
                if(temp<10000) {
                    while (temp > 0) {
                        temp = temp / 10;
                        count++;
                    }

                    int z = 5 - count;
                    for (int k = 1; k <= z; k++) {
                        System.out.print(0);
                    }
                }
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}
