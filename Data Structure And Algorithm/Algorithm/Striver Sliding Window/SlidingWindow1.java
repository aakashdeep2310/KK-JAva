
public class SlidingWindow1 {

    public static int longestSubString(int[] arr, int k){
        // int ans;
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;

        int l = 0; 
        int r = 0;

        while(r<n){
            sum = sum+ arr[r];

            while(sum > k){
                sum = sum - arr[l];
                l = l+1;
            }


            if(sum<=k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r = r+1;
        }

        return maxLen;
    }


    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 4, 3, 10};
        int k = 14;

        int ans = longestSubString(arr, k);
        System.out.println(ans);

    }
    
}