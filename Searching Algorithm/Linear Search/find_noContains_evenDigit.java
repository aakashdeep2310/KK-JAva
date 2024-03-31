import java.util.Scanner;
// leetcode problem
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class find_noContains_evenDigit {
    public static void main(String[] args) {
                
        int[] nums = {12, 345, 2, 6, 7896, 5678};
        int count = findNumbers(nums);
        System.out.println(count);
        // System.out.println(findDigits(878));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int e : nums){
            if(isEven(e)){
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num){
            // String str = String.valueOf(num);
            // int len = str.length();
            // return len%2 == 0;
            int noOfDigits =  findDigits2(num);
            if(noOfDigits%2 == 0){
                return true;
            }
            return false;
    }

    // way 1 to find the digits in a number
    static int findDigits(int num){
        int count = 0;
        while(num>0){
            count++;
            num /= 10;

        }
        return count;

    }

    // way2 to find digits

    static int findDigits2(int num){
        //optimised way to find the digits in the number


        return (int)(Math.log10(num)) + 1;
    }


}
    

