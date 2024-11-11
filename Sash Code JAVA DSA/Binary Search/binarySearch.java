    public class binarySearch {

        public static void main(String[] args) {

            int arr[] = {2, 4, 5, 6, 7, 8, 9, 10};
            int target = 7;
            binarySearchAlgo(arr, target);
            
        }

        public static void binarySearchAlgo(int arr[], int target){

            int ans = -1;
            int start = 0;
            int end = arr.length-1;

            while(start<= end){
                int mid = start + (end - start) / 2;
                if(arr[mid] == target){
                    ans = mid;
                    break;
                }else if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start =  mid + 1;
                }
            }

            if(ans == -1){
                System.out.println("Element not found");
            }else{
                System.out.println("Found element" + target +" at index " + ans);
            }
        }

    }