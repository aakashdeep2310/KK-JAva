import java.util.Arrays;

/**
 * pattern
 */
public class pattern {

    public static void main(String[] args) {
        // triangle(4, 0);
        // triangle2(4, 0);

        int[] arr = {4, 3, 2, 1};
        // bubble(arr, arr.length-1, 0);
        // System.out.println(Arrays.toString(arr));


        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));


        
    }

    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print("*");
            triangle(row, col+1);
        }
        else{
            System.out.println();
            triangle(row-1, 0);
        }
    }

    static void triangle2(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            triangle2(row, col+1);
            System.out.print("*");
        }
        else{
            triangle2(row-1, 0);
            System.out.println();
        }
    }
    static void bubble(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            if(arr[col]> arr[col+1]){
                //swap 
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubble(arr, row, col+1);
        }
        else{
            bubble(arr, row-1, 0);
          
        }
    }

    static void selection(int[] arr, int row, int col, int max){
        if(row == 0){
            return;
        }
        if(col<row){

            if(arr[col]> arr[max]){
                selection(arr, row, col+1, col);
            }else{
                selection(arr, row, col+1, max);
            }
        }
        else{
           int temp = arr[max];
           arr[max] = arr[row-1];
           arr[row-1] = temp;
           selection(arr, row-1, 0,0);
        }
    }
}

