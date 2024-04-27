import java.util.Stack;
public class stack_imp {

    public static void main(String[] args) {
        Stack <Integer>st = new Stack<>();

        st.push(9);
        st.push(4);
        st.push(87);
        st.push(23);
        st.push(434);
        
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}