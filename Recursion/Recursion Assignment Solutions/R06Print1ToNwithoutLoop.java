/**
 * R06Print1ToNwithoutLoop
 */
public class R06Print1ToNwithoutLoop {

    public static void print(int N){

        if(N == 0){
            return;
        }
        print(N-1);
        System.out.print(N+ " ");
    }

    public static void main(String[] args) {
        print(5);
        
    }
}