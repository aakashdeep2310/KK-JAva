import java.lang.reflect.Array;
import java.util.ArrayList;

public class phonePadLeetCode {
    public static void main(String[] args) {
        phonePad("", "12");

        //using ArrayList
        // ArrayList<String> ans = phonePadList("", "12");
        // System.out.println(ans);

        //count 
        // System.out.println(phonePadCount("", "12"));
    }

    static void phonePad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //this will convert '2' into 2

        for(int i = (digit-1) * 3; i < (digit*3); i++){
            char ch = (char) ('a' + i);
            phonePad(p +ch, up.substring(1));
        }
    }

    //using ArrayList
    static ArrayList<String> phonePadList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0'; //this will convert '2' into 2

        for(int i = (digit-1) * 3; i < (digit*3); i++){
            char ch = (char) ('a' + i);
            ans.addAll(phonePadList(p +ch, up.substring(1)));
        }


        return ans;
    }


    static int phonePadCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0'; //this will convert '2' into 2
        int count = 0;
        for(int i = (digit-1) * 3; i < (digit*3); i++){
            char ch = (char) ('a' + i);
            count = count + phonePadCount(p +ch, up.substring(1));
        }

        return count;
    }




    //Leet code solution
    /* 
    class Solution {
        static final String[] mapping = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
          if(digits.isEmpty()){
            return list;
          }
          generateCombinations("", digits, list);
          return list;
        }
          private void generateCombinations(String current, String remaining, List<String> list){
            if(remaining.isEmpty()){
                list.add(current);
                  return;
            }
            int digit = remaining.charAt(0) - '0';
            String letters = mapping[digit - 2];
    
            for(char ch : letters.toCharArray()){
                generateCombinations(current + ch, remaining.substring(1), list);
            
            }
        
        }
    }
    */
    
}
