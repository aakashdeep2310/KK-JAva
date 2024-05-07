import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Son son = new Son(22);
        son.career();

        son.normal();
        
        Parent daughter = new Daughter(20);
        // reference of a parent (Dynamic method dispatch)
        daughter.career();

        // we cant create the object of an abstract class

        Parent.hello();
    }
    
    
}