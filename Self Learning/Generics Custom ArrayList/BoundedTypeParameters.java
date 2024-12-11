// Bounded Type Parameters

public class BoundedTypeParameters<T extends Number> {

    private T number;

    public BoundedTypeParameters(T number){
        this.number = number;
    }

    public void printDouble(){
        System.out.println(number.doubleValue());
    }

    public static void main(String[] args) {
        BoundedTypeParameters<Integer> integerExample = new BoundedTypeParameters<>(10);
        integerExample.printDouble();

        BoundedTypeParameters<Double> doubleExample = new BoundedTypeParameters<>(10.5);
        doubleExample.printDouble();
    }
    
}
