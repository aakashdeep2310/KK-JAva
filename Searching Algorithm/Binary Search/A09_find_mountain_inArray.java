public class A09_find_mountain_inArray {
    public static void main(String[] args) {
        
        
    }


    static int search(int[] arr, int target){
        int peak = peakInMountainArray(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr, target, peak +1 , arr.length-1);  
    }

    static int peakInMountainArray(int[] arr){

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

    static int orderAgnostic(int[] arr, int target, int start, int end) {

        
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
    
}
