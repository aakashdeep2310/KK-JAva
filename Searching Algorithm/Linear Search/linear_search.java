public class linear_search{
    public static void main(String[] args) {
        int[] nums = {23, 55, 7, 8, 9, 25, -11};
        int target = 22;
         int index =linearSearch(nums, target);
         if(index !=-1){
             System.out.println(index);

         }else{
            System.out.println("Element not found");
         }
    

    }

    static int linearSearch(int[] arr, int target){
       
            if(arr.length == 0){
                return -1;
            }

            for(int index = 0; index<arr.length; index++){
                int element = arr[index];
                if(element == target){
                    return index;
                }

            }
            return -1;
    }

}