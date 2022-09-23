package questions;

import java.util.Scanner;
// Minimum no of turns  required to reach the page
public class Day3 {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int p=scan.nextInt();
     int noOfTurns;
     if((n/2)<p){
         noOfTurns=n/2-p/2;
         System.out.println(noOfTurns);
     }else{
         noOfTurns=p/2;
         System.out.println(noOfTurns);
     }
    }
}
