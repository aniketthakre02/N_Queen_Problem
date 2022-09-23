package questions;
import java.util.Scanner;
//oddly even problem
public class Day6 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        long digit=scan.nextLong();
        int even=0,odd=0,i=0;
        long temp=digit;
        while(temp!=0){
          temp=temp/10;
          i++;
        }
        for(int j=i;j>=1;j--){
            if(j%2==0){
                even= (int) (even + digit%10);
                digit=digit/10;
            }else{
                odd= (int) (odd + digit%10);
                digit=digit/10;
            }
        }
        if(odd>even){
            System.out.println(odd-even);
        }else{
            System.out.println(even-odd);
        }
    }
}
