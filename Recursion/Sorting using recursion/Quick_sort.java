import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        // int[] arr = {5, 4, 3, 2, 1};
        int[] arr = {10, 80, 30, 90, 40, 18, 90};

        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int hi){

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        if (low >= hi) { 
            return;
        }

        while(start<= end){

            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if(start<= end){
                //swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        // now my pivot is at correct index, please sort two halves now
        sort(arr, low, end);
        sort(arr, start, hi);
        }
    
}

/* This Java code implements the Quick Sort algorithm to sort an array of integers in ascending order. Here's a brief explanation of the code:

//main method:
Initializes an array arr with integers.
Calls the sort method to sort the array.
Prints the sorted array using Arrays.toString.

//sort method:
Takes three parameters: the array arr, the index low representing the start of the sub-array, and the index hi representing the end of the sub-array.
Calculates the middle index mid as the midpoint of the sub-array.
Selects the pivot element as arr[mid].
Checks for the base case where low is greater than or equal to hi, in which case it returns, indicating that the sub-array has one or fewer elements.
Uses two pointers (start and end) to traverse the sub-array from both ends towards the pivot.
Moves start towards the end until it finds an element greater than or equal to the pivot.
Moves end towards the start until it finds an element less than or equal to the pivot.
If start is less than or equal to end, it swaps the elements at start and end, and increments start and decrements end.
Once the partitioning is done, the pivot is at the correct index. It recursively calls sort on the sub-arrays before and after the pivot to sort them.
This process continues until the base case is reached, sorting the sub-arrays in place around the pivot.
Overall, this code efficiently sorts the input array using the Quick Sort algorithm, which has an average time complexity of O(n log n). However, the worst-case time complexity is O(n^2) when the pivot selection is not optimal.
 */
