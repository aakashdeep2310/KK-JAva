public class A02_binRecursive {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 9, 10, 12, 14, 16};
        int target = 7;

    
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        if(start>end){
            return -1;
        }

        int middleValue = start + (end - start) / 2;

        if(target == arr[middleValue]){
            return middleValue;
        }

        if(target < arr[middleValue]){
            return binarySearch(arr, target, start, middleValue - 1);
        }
        return binarySearch(arr, target, middleValue + 1, end);
    
    }
    
}
