/**
 * level1
 */
public class level1 {

    public static void main(String[] args) {
        // fun(5);
        // funReverse(5);

        // funBoth(5);

        // int ans =fact(5);
        // System.out.println(ans);

        // int sum = sum(5);
        // System.out.println(sum);

        // int sumOfDigit = sumOfDigits(4321);
        // System.out.println(sumOfDigit);

        // int product = product(55);
        // System.out.println(product);

        // Reverse rv = new Reverse();
        // rv.rev1(2345);
        // System.out.println(rv.sum1);
        

    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        fun(n-1);
    }

    static void funReverse(int n){
        if(n == 0){
            return ;
        }

        funReverse(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if(n== 0){
            return;

        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }


    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
        
    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }
      return n+sum(n-1);
    }

    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        return sumOfDigits(n/10) + (n%10);


    }

    static int product(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) *  product(n/10);
    }
}

    class Reverse{
        static int sum1 = 0;

        static void rev1(int n){
            if(n == 0){
                return ;
            }

            int rem = n % 10;
            sum1 = sum1 * 10 + rem;
            rev1(n/10);

        }
    }