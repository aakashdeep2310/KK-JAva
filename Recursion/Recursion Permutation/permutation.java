import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        // permutationRec("", "abc");



        // System.out.println(permutationRecList("", "abc"));
        //or
        // ArrayList<String> ans = permutationRecList("", "abc");
        // System.out.println(ans);
        

        

        //count function
        System.out.println(permutationRecCount("", "abcd"));
        
    }

    static void permutationRec(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i); 
            String s = p.substring(i, p.length());
            permutationRec(f+ch+s, up.substring(1));


        }
    }


    static ArrayList<String> permutationRecList(String p, String up){
        if(up.isEmpty()){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
          return list;
           
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i); 
            String s = p.substring(i, p.length());
            ans.addAll(permutationRecList(f+ch+s, up.substring(1)));


        }
        return ans;
    }
    

    static int permutationRecCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i); 
            String s = p.substring(i, p.length());
            count = count + permutationRecCount(f+ch+s, up.substring(1));


        }
        return count;
    }
}


/*
 This Java code generates all permutations of a given string using recursion. Let's break it down:

permutation class: This is the main class containing the main method where the program starts execution.

main method: This method is the entry point of the program. Here, it calls the permutationRecList method to generate permutations of the string "abc" and then prints the result.

permutationRec method: This method generates permutations recursively. It takes two parameters:

p: A string representing the current permutation being built.
up: A string representing the remaining characters to be permuted.
It works as follows:

Base case: If up is empty, it means all characters have been used, so the current permutation p is printed.
Otherwise, it iterates over each character in up. For each character, it calls permutationRec recursively, passing the current permutation f+ch+s (where f is the substring of p before index i, ch is the current character from up, and s is the substring of p after index i) and the remaining characters in up excluding the current character.
permutationRecList method: This method is similar to permutationRec but instead of printing permutations, it collects them in an ArrayList and returns the list. It has the same base case and recursive logic as permutationRec, but it accumulates permutations in an ArrayList called ans instead of printing them.

Overall, both methods use a recursive approach to generate permutations by iterating over each character of the input string and recursively permuting the remaining characters.
 */