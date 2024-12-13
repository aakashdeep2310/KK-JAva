public class circularQueue {

    protected int[] data;
    private static final int   DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public circularQueue(){
        this(DEFAULT_SIZE);
    }
    public circularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    //here removal no need to shift the element because it is circular queue
    public int remove()  throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        do{
            System.out.print(data[i] + " -> ");   
            i++;
            i%= data.length;

        }while(i!= end);
        System.out.println("END");
    }
    public static void main(String[] args) throws Exception {
        circularQueue queue = new circularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(53);
        queue.insert(45);

        queue.display();
        
        System.out.println(queue.remove());
        queue.insert(133);

        
        queue.display();
        
    }
    
}
