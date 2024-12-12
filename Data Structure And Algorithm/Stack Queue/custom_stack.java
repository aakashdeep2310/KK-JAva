public class custom_stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public custom_stack(){
        this(DEFAULT_SIZE);
    }

   public custom_stack(int size){
    this.data = new int[size];

    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from the empty stack");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from the empty stack");
        }
        return data[ptr];

    }



    public static void main(String[] args) throws Exception{

        custom_stack stack = new custom_stack(5);
        stack.push(345);
        stack.push(3);
        stack.push(45);
        stack.push(6);
        stack.push(654);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }
    
}
