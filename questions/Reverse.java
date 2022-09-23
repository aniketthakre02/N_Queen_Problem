package questions;

import java.util.Arrays;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            String str= input.next();
            char[] ch=new char[str.length()];
            for(int i=0;i<ch.length;i++){
                ch[i] =str.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
            StringBuilder restr=new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            restr.append(ch[i]);
        }
        System.out.println(restr);
    }
}
