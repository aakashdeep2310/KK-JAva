public class Search_inRange {
    public static void main(String[] args) {
        int[] arr = {18, 19, 14, 16, 12, 22};
        int target = 18;
    
        System.out.println(search_inRange(arr, 3, 5, target));

    
        
    }

    static int search_inRange(int[] arr, int start, int end, int target){
        start = 0;
        end = arr.length;
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i<end; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    
}
