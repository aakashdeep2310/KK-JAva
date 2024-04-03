import java.util.Arrays;

public class A01_bubble_sort{

    static void sort(int[] arr){
        boolean swapped;
        for(int i = 0; i<arr.length-1; i++){
            swapped = false;

            for(int j = 0; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
        }


    }

    static void printArr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 4, 1};
        sort(arr);
        // printArr(arr);
        System.out.println(Arrays.toString(arr));
        

    }
}