

import java.util.Arrays;

/**
 * mergeSort
 */
public class inPlaceMergeSort {
    

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {3, 5, 2, 8, 6, 9, 1};
        int start = 0;
        int end = arr.length;

        mergeSortInPlace(arr, start, end);
        System.out.println(Arrays.toString(arr));


    }

    static void mergeSortInPlace(int[] arr, int start, int end){
        if(end - start == 1){
            return ;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr, 0, mid); // original array is being being modified
        mergeSortInPlace(arr, mid, end);
      
        mergeInplace(arr, start, mid, end);

    }

    private static void mergeInplace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];
        
        int i = start;
        int  j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i]< arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i< mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< end){
            mix[k] = arr[j];
            j++;
            k++;
        }

       for(int l = 0; l<mix.length; l++){
        arr[start+l] = mix[l];
       }

    }
}
