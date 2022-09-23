package questions;
 import java.util.Scanner;
public class Excel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N= input.nextInt();
        String colName="";
        int rem;
        while(N>26){
            rem=N%26;
            colName=colName+(char)('A'+rem-1);
            N=N/26;
        }
        colName=colName+(char)('A'+((N)-1));
        char[] ch=new char[colName.length()];
        for(int i=0;i<ch.length;i++){
            ch[i] =colName.charAt(i);
        }
        StringBuilder restr=new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            restr.append(ch[i]);
        }
        System.out.println(restr);

    }
}
