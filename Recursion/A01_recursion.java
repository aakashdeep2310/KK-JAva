
public class A01_recursion {

    public static void main(String[] args) {
        // print(1);
        System.out.println((fibo(5)));
    
    }

    static void print(int n){

        
        if(n == 5){
            return;
        }

        System.out.println(n);
        print(n+1);
    }

    static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);

    }
    
}