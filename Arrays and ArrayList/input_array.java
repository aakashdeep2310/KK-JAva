import java.util.Arrays;
import java.util.Scanner;

public class input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // arr[0] = 23;
        // arr[1] = 56;
        // arr[2] = 24;
        // arr[3] = 75;
        // arr[4] = 46;

        // System.out.println(arr[0]);


        // input using for loops
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }


        // Printing arrays
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }

        // Print using Arrays Class // best way to print array
        // System.out.println(Arrays.toString(arr));

        // printing array using enhanced for loop
        // for(int num : arr){
        //     System.out.print(num+ " "); // num represents element of the array
        // }


        //Arrays of objects
        String[] str = new String[4];
        System.out.println("Enter string in the arrays");
        for(int i = 0; i<str.length; i++){
            str[i] = sc.next();
        }

        //Modify
        str[1] = "Aakash"; 
//         ||
//       reference variable 

        System.out.println(Arrays.toString(str));


    }
    
}
