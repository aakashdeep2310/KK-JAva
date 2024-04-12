
//{ Driver Code Starts
import java.util.*;

// import javax.xml.transform.stream.StreamSource;

public class mergeSort_ArrayList {
    static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.err.println("Enter the number in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Solution sl = new Solution();
        sl.mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

class Solution {
    void merge(int arr[], int l, int m, int r) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m + 1;

        while (left <= m && right <= r) {
            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= m) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }

    }

    void mergeSort(int arr[], int l, int r) {

        int low = l;
        int high = r;

        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }
}

/*
 This Java code performs the Merge Sort algorithm to sort an array of integers in ascending order. Here's a brief explanation of the code:

main method:
Takes input from the user to determine the size of the array and the elements of the array.
Creates an instance of the Solution class.
Calls the mergeSort method of the Solution class to sort the array.
Prints the sorted array using the printArray method.
Solution class:

Contains two methods: merge and mergeSort, responsible for merging and sorting the array, respectively.

merge method:
Merges two sorted sub-arrays into one sorted array.
Takes four parameters: the array arr[], and the indices l, m, and r representing the left, middle, and right boundaries of the sub-arrays to be merged.
Initializes an ArrayList temp to store the merged elements.
Initializes two pointers left and right to traverse the two sub-arrays.
Compares elements from the two sub-arrays and adds the smaller element to temp.
After one sub-array is exhausted, adds the remaining elements of the other sub-array to temp.
Copies the elements from temp back to the original array arr[].

mergeSort method:
Recursively sorts the array using the merge sort algorithm.
Takes three parameters: the array arr[], and the indices l and r representing the left and right boundaries of the sub-array to be sorted.
Checks for the base case where l is not less than r, indicating that the sub-array has one or fewer elements, in which case it returns.
Calculates the middle index mid.
Recursively calls mergeSort on the left and right halves of the array.
Calls the merge method to merge the sorted halves.
Overall, this code efficiently sorts the input array using the Merge Sort algorithm, which has a time complexity of O(n log n) in all cases.
 */
