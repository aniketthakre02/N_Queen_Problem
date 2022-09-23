package questions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int X=input.nextInt();
        int Time=(N*10)-10;
        int arrivalTime=N*X-X;
        int watingTime=Time-arrivalTime;


        System.out.println("wating time of last patient "+watingTime);
    }
}
