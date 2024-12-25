public class dynamicStack extends custom_stack {

    public dynamicStack(){
        super();
    }
    public dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        // this take care of it being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length *2];

            //copy all previous items in new data
            for(int i = 0; i<data.length; i++){
                temp[i] = data[i];
            }

            data = temp;

        }

        // at this point we know that array is not full
        //insert item
        return super.push(item);

    }

    public static void main(String[] args) throws Exception{
        dynamicStack stack = new dynamicStack(5);

        stack.push(345);
        stack.push(4523);
        stack.push(45);
        stack.push(43);
        stack.push(4554);
        stack.push(87);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}
