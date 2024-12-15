public class R03BinarySearch {


    public static int binSearch(int[] arr, int target, int start, int end){

        

        if(start>end){
            return -1;
        }

        int mid = start + (end - start)/2; 

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return binSearch(arr, target, start, mid-1);
        }
       
            return binSearch(arr, target, mid + 1, end);
        
    }


    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 7, 3, 9, 4};
        int key = 4;

        int start = arr[0];
        int end = arr.length;
        
        System.out.println(binSearch(arr, key, start, end));
    }
    
}
