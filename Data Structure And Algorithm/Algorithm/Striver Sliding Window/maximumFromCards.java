public class maximumFromCards {

    public static int points(int[] arr, int k) {

        int maaxSum = 0;
        int n = arr.length;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < k; i++) {
            leftSum = leftSum + arr[i];
        }
        maaxSum = leftSum;

        for (int i = 0; i < k; i++) {
            leftSum -= arr[k - 1 - i];
            rightSum += arr[n - 1 - i];

            maaxSum = Math.max(maaxSum, leftSum + rightSum);
        }
        return maaxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };

        int ans = points(arr, 4);
        System.out.println("The answer is : " + ans);
    }

}
