
import java.util.Stack;
public class imp_queue_usingStack {


    public static void main(String[] args) {
        
    }

    // Using 2 stack, pop from first then push 
    // in the second and then remove the first 
    // element and then again pop the element
    //  from the second stack and push the element 
    // in the first stack

    private Stack<Integer> first;
    private Stack<Integer> second;

    public imp_queue_usingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push((first.pop()));
        }

        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    
}
