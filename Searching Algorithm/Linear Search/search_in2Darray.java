import java.util.Arrays;

public class search_in2Darray {
    public static void main(String[] args) {
        int arr[][] = {
            {12, 23, 45},
            {25, 46, 26},
            {13, 52, 36},
        };

    //     int target = 52;
    //     int[] ans = Sin2dArray(arr, target);
    //    System.out.println(Arrays.toString(ans));


       // Find max in 2d arrays
    //    int max = findMax(arr);
    //    System.out.println(max);


       // Find min in 2d arrays
       int min = findMin(arr);
       System.out.println(min);
        


    
    }

    static int[] Sin2dArray(int arr[][], int target){

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i, j};
                }
            }

        }
        return null;
        

    }

    // Find maximum in 2d array

    static int findMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                int element = arr[i][j];
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }

    // Find minimum in the 2d Arrays
    static int findMin(int arr[][]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                int element = arr[i][j];
                if(element < min){
                    min = element;
                }
            }
        }
        return min;
    }
    
}
