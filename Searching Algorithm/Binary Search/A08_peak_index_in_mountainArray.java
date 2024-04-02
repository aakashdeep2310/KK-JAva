public class A08_peak_index_in_mountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        // int target = 6;

        int index = find(arr);
        System.out.println("Element found at index no : " + index);


    }

    static int find(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int middleValue = start + (end - start) /2;

           
            if(arr[middleValue] > arr[middleValue+1]){
                end = middleValue;
            }
            else{
                start = middleValue + 1;
            }

        }

        return start;
    }
    
}
