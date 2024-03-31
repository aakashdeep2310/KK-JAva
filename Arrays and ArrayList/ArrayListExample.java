import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(4);
        list.add(532);
        list.add(43);
        list.add(35234);
        list.add(56);
        list.add(36754);
        list.add(3464);
        list.add(76);

        // System.out.println(list);
        // System.out.println(list.contains(76));

        System.out.println(list);
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        
        // output
        for (int i = 0; i < 5; i++) {
            // System.out.print(list+" ");
            System.out.print(list.get(i)+ " ");// if you want to print the element through the index 

        }


        // System.out.println("***********");
        // System.out.println(list);
    }
    
}
