
class binSearch{
    // return the index of smallest no >= target
    public int ceil(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        
        // but what if the target is greater than the greatest number in the array 
        if(target>arr[end]){
            return -1;
        }

        while(start<=end){
           
            int middleValue = start + ( end - start) / 2 ; 


            
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
        return start;
        
    }
}



public class A03_Ceiling_inBS{
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 18;

        binSearch bs = new binSearch();
        int index = bs.ceil(arr,target);
        if(index == -1){
            System.out.println("Element not found in the given array");
        }else{
            System.out.println("Element found on index : " + index);
        }

      
    }
}
