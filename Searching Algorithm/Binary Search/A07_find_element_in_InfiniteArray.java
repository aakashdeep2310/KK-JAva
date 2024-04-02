public class A07_find_element_in_InfiniteArray {
    public static void main(String[] args) {
        // asssume that, this is an infinite array and you have to find the given target

        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 15, 18, 23, 17, 30};
        int[] arr =  {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        
        int index =  ans(arr, target);
        System.out.println("Element found at index : " +  index);
        
    }

    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // to find the new box // start and end of that box
             end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return findTarget(arr, target, start, end);
    }


    static int findTarget(int[] arr, int target, int start, int end){
        while(start <= end){
            int middleValue = start + (end - start) / 2;

            if(target > arr[middleValue]){
                start = middleValue + 1;

            } else if (target < arr[middleValue]){
                end = middleValue - 1;
            }
            else{
                return middleValue;
            }
        }
        return -1;
    }

}
