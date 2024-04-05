public class A01_pattern{
    public static void main(String[] args) {
        // pattern(4);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        pattern28(5);

        

    }

    static void pattern(int n){
        for(int row = 1; row<=n; row++){
            for(int j = 1; j<=row; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 0; i<2*n; i++){
            int totalColsInRow = i > n ? 2 * n - i : i;
            for(int j = 0; j<totalColsInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern28(int n){
        for(int i = 0; i<2*n; i++){
            int totalColsInRow = i > n ? 2 * n - i : i;
            int noOfSpaces = n- totalColsInRow;
            for(int j = 0; j<noOfSpaces; j++){
                System.out.print(" ");
            }

            for(int col= 0; col<totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}