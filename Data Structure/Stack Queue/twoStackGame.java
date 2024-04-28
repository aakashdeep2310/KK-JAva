import java.util.*;

public class twoStackGame {
    static int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1; // what we are getting from recursion we have to sub 1 because it will
                                             // exceed the sum limmit

    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        // base condition
        if (sum > x) {
            return count;
        }

        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // no. of test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // no. of element in stack 1
            int m = sc.nextInt(); // no. of element in stack 2
            int x = sc.nextInt(); // Max Sum what we assume like 10
            int[] a = new int[n];
            int[] b = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(twoStacks(x, a, b));

        }

    }

}
