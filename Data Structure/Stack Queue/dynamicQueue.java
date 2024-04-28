
public class dynamicQueue extends circularQueue{
    public dynamicQueue(){
        super();
    }
    public dynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){
        //take care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];
            //copy all previous items in new data
            for(int i = 0; i<data.length; i++){
                temp[i] = data[(front + i) % data.length];
            }
            front = 0; 
            end = data.length;
            data = temp;
            //O(n) because it is copying all the data
        }
        return super.insert(item);
    }
    


    public static void main(String[] args) {
        
    }
}