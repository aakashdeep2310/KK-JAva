import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_array {
    public static void main(String[] args) {
        // first way
        // int[][] arr = new int[3][]; //giving row size is mandatory

        // second way
        int [][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},   // array of arrays
            {7, 8, 9}
        };
        System.out.println(arr2[0][0]);

        System.out.println(Arrays.toString(arr2[1]));
       

        //Jagged Array

        int[][] arr3 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        System.out.println(arr.length); // this will only print the row size [3]

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row we have to take input in jagged array
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
                
            }
        }

        // System.out.println(Arrays.toString(arr[0]));

        System.out.println("**************");

        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        //for each loop for output
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }


    
    
}
