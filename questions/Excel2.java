package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Excel2 {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        String input=scan.nextLine();
       char ch[]=input.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(titleToNumber(ch));
     }

    private static int titleToNumber(char[] ch){
        int result=0;
        for(int i=0;i<ch.length;i++){
            result=result*26;
            result=result+ch[i]-'A'+1;
        }
        return result;
    }
}
