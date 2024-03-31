import java.util.Arrays;

public class change_inArray {
    public static void main(String[] args) {
        
        int nums[] = {2, 3, 4, 5};

        System.out.println(Arrays.toString(nums));
        change(nums);
        // for(int i= 0; i<nums.length; i++){
            //     System.out.print(nums[i]+ " ");
            // }
        System.out.println(Arrays.toString(nums));


    }

    // Mutable array
    static void  change(int[] arr){
        arr[0] = 99;
    }
    
}
