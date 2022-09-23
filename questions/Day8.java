package questions;

import java.util.*;
import java.util.Scanner;

//#4
public class Day8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(10);

        for(int i=9;i>=2;i--){
            if(x%i==0){
                list.add(i);
                System.out.println(i);
                x=x/i;
                i=i+1;
            }
        }
        System.out.println(list);
        int ans=0;
        for(int j=list.size()-1;j>=0;j--){
            ans=ans*10+list.get(j);
        }
        System.out.println(ans);
    }
}
