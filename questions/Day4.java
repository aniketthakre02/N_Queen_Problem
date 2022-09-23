package questions;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        //200 540
        Scanner scan=new Scanner(System.in);
        int v=scan.nextInt();
        int w=scan.nextInt();
        float fw= (w-2*v)/2;
       if(w>2&&(w%2==0)&&v<w){
           System.out.println("FW="+(int)(fw)+" TW="+(int)(v-fw));
       }else{
           System.out.println("INVALID INPUT");
       }
    }
}
