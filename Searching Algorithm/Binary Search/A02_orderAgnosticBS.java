import java.util.Scanner;

public class A02_orderAgnosticBS {

    static int searching(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[0] < arr[arr.length - 1];

        while (start <= end) {

            int middleValue = start + (end - start) / 2;

            if (target == arr[middleValue]) {
                return middleValue;
            } 

            if (isAscending) {
                // it means array is in ascending order
                
                if (target > arr[middleValue]) {
                    start = middleValue + 1;
                } 
                else {
                    end = middleValue - 1;
                }
            }
            else {
                // it means array is in descending order
                if (target > arr[middleValue]) {
                    end = middleValue - 1;
                }
                else {
                    start = middleValue + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // int[] arr = { 97, 86, 56, 54, 45, 34, 23, 21, 12 };
        int[] arr = {2, 4, 5, 7, 9, 34, 54, 76, 88, 98, 101};

        // int target = 12;
        int target = 76;
        int index = searching(arr, target);

        if (index == -1) {
            System.out.println("Element not found in given array");
        } else {
            System.out.println("Element found on index : " + index);
        }
    }

}
