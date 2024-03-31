import java.util.Arrays;

public class search_inString {
    public static void main(String[] args) {
        
        String str = "Aakash";
        char target = 'g';

        // System.out.println(search_inString(str, target));
        // System.out.println(search_inString2(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search_inString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean search_inString2(String str, char target){
        if(str.length() == 0){  // Using for each loop
            return false;
        }
        char[] ch = str.toCharArray();


        for (char c : ch) {
            if(c == target){
                return true;
            }
        
        }
        return false;
    }
    
}
