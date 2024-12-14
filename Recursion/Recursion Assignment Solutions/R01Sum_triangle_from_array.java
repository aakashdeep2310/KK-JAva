import java.util.Arrays;

public class R01Sum_triangle_from_array {


    public static void printTriangle(int[] A){

        // Base Case
        if(A.length < 1 ){
            return;
        }

        // Creating new array which contains the sum 
        // of consecutive elements in the array passes as parameter
        int[] temp = new int[A.length-1];
        for(int i = 0; i< A.length -1; i++){
            int x = A[i] + A[i+1];
            temp[i] = x; 
        }

        // make a recursive call and pass the newly created array
        printTriangle(temp);

        // print current array in the end so that smaller arrays are printed first
        System.out.println(Arrays.toString(A));
    }

    
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        printTriangle(A);
    }
}