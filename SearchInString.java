import java.sql.SQLOutput;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="Aniket";
        char target='u';
        System.out.println((search(name, target)));
        //OR
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name,target));
    }

    private static boolean search2(String str, char target) {
        if (str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;
    }

    private static boolean search(String str, char target) {
        if (str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++)
            if(target==str.charAt(i)){
                return true;
            }
        return false;
    }
}
