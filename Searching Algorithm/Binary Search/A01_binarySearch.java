
class binSearch{
    public int searching(int[] arr, int target){

        int start = 0;
        int end = arr.length;
        
        while(start<=end){
            // int middleValue = (start + end)/2; // might be possible that (start + end) exceeds the range of integer in java
            int middleValue = start +( end - start) / 2 ; 

            
            if(arr[middleValue] == target){
                return middleValue;
                
            }

            else if(target<arr[middleValue]){
                end = middleValue - 1;
            }
            else{
                start = middleValue + 1;
            }

        }
        return -1;
        
    }
}



public class A01_binarySearch{
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 12;

        binSearch bs = new binSearch();
        int index = bs.searching(arr,target);
        if(index == -1){
            System.out.println("Element not found in the given array");
        }else{
            System.out.println("Element found on index : " + index);
        }

      
    }
}