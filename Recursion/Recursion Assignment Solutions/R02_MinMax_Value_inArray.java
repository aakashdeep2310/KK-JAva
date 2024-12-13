public class R02_MinMax_Value_inArray {

    public static int minMax(int[] arr, int n){
        //base case
        if(n == 1){
            return arr[0];
        }

        return Math.min(arr[n-1], minMax(arr, n-1));

    }


    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int n = arr.length;

        System.out.println(minMax(arr, n));
        
    }
    
}
