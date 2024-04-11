class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while(start<=end){
           
            int middleValue = start + ( end - start) / 2 ; 

            if(target<letters[middleValue]){
                end = middleValue - 1;
            }
            else{
                start = middleValue + 1;
            }
        }
        return letters[start % letters.length];
        
    }
}

public class A05_smallestLetter_leetcode {
    public static void main(String[] args) {
        
        Solution s = new Solution();
        
        char[] letters = {'c', 'f', 'j'};
        char target = 'k';
        char ch = s.nextGreatestLetter(letters, target); 
        System.out.println(ch);  
    }
    
}
