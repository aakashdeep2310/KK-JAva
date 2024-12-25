// Generic Method
public class GenericMethod {
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C"};
        
        printArray(intArray);
        printArray(stringArray);

    }
    
}
