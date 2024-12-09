import java.util.Stack;

public class learnStack {

    public static void main(String[] args) {
        
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Dog");
        animals.push("Cat");
        System.out.println("Stack : "+ animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        
    }
}
