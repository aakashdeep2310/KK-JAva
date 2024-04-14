import java.util.Arrays;
public class Merge_sort {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 8, 6, 9, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // ==> creating new object for every function call , original array is not being modified
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second ){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int  j = 0;
        int k = 0;
        while(i< first.length && j< second.length){
            if(first[i]< second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }
}

/* 
The main method:

Initializes an array arr with some integers.
Calls the mergeSort method to sort the array.
Prints the sorted array using Arrays.toString.
The mergeSort method:

If the length of the input array is 1, it returns the array (base case).
Otherwise, it calculates the middle index of the array.
Recursively calls mergeSort on the left half and right half of the array.
Merges the sorted left and right halves using the merge method.
The merge method:

Creates a new array mix to store the merged result, with a length equal to the sum of the lengths of the input arrays.
Iterates through both input arrays (first and second) simultaneously.
Compares elements at corresponding indices and adds the smaller element to the mix array.
Copies any remaining elements from either array to the mix array.
Returns the merged array.
Overall, the code efficiently sorts the input array using the Merge Sort algorithm, which has a time complexity of O(n log n).
*/