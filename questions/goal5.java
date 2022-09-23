package questions;

import java.util.Scanner;
public class goal5 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        int count1=0;
        int count2=0;
        while(z!=1){
            if(x%z==0&&x>0){
             count1++;
             x--;
            }else if(x%z==0&&x>0){
                count2++;
                y--;
            }else{
                z--;
            }
        }
        System.out.println("goal by x are "+ count1);
        System.out.println("goal by y are "+ count2);

    }
}
