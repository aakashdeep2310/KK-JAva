

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

/* 

This Java code implements an in-place version of the Merge Sort algorithm, which means it sorts the array without using additional memory for creating new arrays to merge. Let's break it down:

main method:

Initializes an array arr with some integers.
Defines start and end indices to represent the range of the array.
Calls the mergeSortInPlace method to sort the array in place.
Prints the sorted array using Arrays.toString.
mergeSortInPlace method:

If the difference between end and start is 1 (i.e., only one element is present), it returns, as there's nothing to sort.
Calculates the middle index (mid) of the current range.
Recursively calls mergeSortInPlace on the left half and right half of the array, modifying the original array.
Merges the sorted left and right halves in place using the mergeInplace method.
mergeInplace method:

Initializes an array mix to temporarily store the merged result.
Iterates through the two sorted halves (start to mid and mid to end) simultaneously.
Compares elements at corresponding indices and places the smaller element in the mix array.
Copies any remaining elements from either half to the mix array.
Copies the merged result back into the original array from the start index.
Overall, this code sorts the input array in place using the Merge Sort algorithm, efficiently dividing the array into smaller halves, sorting them, and merging them back together, all within the original array.
*/