package questions;

import java.util.Scanner;
// Kth largest Factor of N
public class Day1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1,n2;
        n1= scan.nextInt();//12(1,2(1),3,4(3),6,12)
        n2= scan.nextInt();//3 ans 4
        System.out.println(KthFactor(n1,n2));


    }
    private static int KthFactor(int n1, int n2) {
        int count=0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                count++;
                if(count==(n2+1)){
                    return i;
                }
            }
        }

     return 1;
    }
}
