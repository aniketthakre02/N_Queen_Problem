package questions;

import java.util.Arrays;
import java.util.Scanner;

//question in mobile from sushant
public class cogni1 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int input1=input.nextInt();
        int[] input2=new int[input1];
        for(int element: input2){
            element=input.nextInt();
        }
        System.out.println(Arrays.toString(input2));

        StringBuilder str=new StringBuilder();
        int index=0;
        int max=input2[0];
        for(int i=0;i<input2.length;i++){
            if(max<input2[i]){
                max=input2[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<input2.length;i++){}



    }
}
