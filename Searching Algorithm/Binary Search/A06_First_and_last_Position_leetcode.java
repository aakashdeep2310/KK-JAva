public class A06_First_and_last_Position_leetcode {


    public static void main(String[] args) {

        int[] arr  = {5, 7, 7, 7, 7, 8, 10};
        int target = 7;

        // A06_First_and_last_Position_leetcode  sol = new A06_First_and_last_Position_leetcode();

        // int[] result = sol.firstandlast(arr, target);
        // System.out.println(result[0] + ", " + result[1]);
        
        int[] result = firstandlast(arr, target);
        System.out.println(result[0] + ", "+ result[1]);
      

    }

    public static int[] firstandlast(int[] arr, int target){
         int[] ans = {-1, 1};

         // check for first occurrence if target first
          int start = search(arr, target, true);
          int end = search(arr, target, false);

          ans[0] = start;
          ans[1] = end;

          return ans;
    }


        // this function will just returns the index value of target
     static int search(int[] arr, int target, boolean fintStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start<= end) {
            
            int mid = start + (end - start) / 2;

            if(target< arr[mid]){
                end = mid - 1;
            }else if(target> arr[mid]){
                start = mid + 1; 
            }
            else{
                // potential answer found
                ans = mid;
                if(fintStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    
    
}
