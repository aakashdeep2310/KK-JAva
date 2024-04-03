import java.util.ArrayList;

public class preetyPrinting{

    public static void main(String[] args) {

        float a = 343.1290f;
        // System.out.printf("Formatted number is %.2f", a);

        // System.out.printf("%.3f", Math.PI);

        System.out.printf("My name is %s and i am %s", "Aakash" , "Cool");
        System.out.println();

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 'b');
        System.out.println('a' + "b");
        System.out.println("a" + 3);
        // integer will be converted to Integer that will call toString(). 
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));

        System.out.println("Aakash" + new ArrayList<>());
        System.out.println("Aakash" + new Integer(453));
        // System.out.println( new Integer(453) + new ArrayList<>()); error // atleast one string
        System.out.println( new Integer(453) +" String " + new ArrayList<>()); 

        System.out.println("          Aakash               ");
        String name = "        Aakash         ";
        System.out.println(name.strip());
        System.out.println(name.trim());
    }
}