import java.lang.reflect.Array;
import java.util.Arrays;

public class find_max {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 3};

        // System.out.println(max(arr)); // find maximum in full array
        // System.out.println(maxInRange(arr, 1, 3));
        
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static int max(int arr[]){
        int maxi = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi; 
    }
    
    
    // find max in the range
    static int maxInRange(int arr[], int start, int end){
        int maxi = start;
        for(int i = start; i<=end; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi; 
    }

    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){    
            swap(arr, start, end);
            start++;
            end--;
        }

        
    }

    static void swap(int arr[], int start, int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    }
    

}
