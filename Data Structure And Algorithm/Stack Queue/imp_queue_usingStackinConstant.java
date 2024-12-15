import java.util.Stack;
public class imp_queue_usingStackinConstant {
   
    
    
        public static void main(String[] args) {
            
        }
    
        private Stack<Integer> first;
        private Stack<Integer> second;
    
        public imp_queue_usingStackinConstant(){
            first = new Stack<>();
            second = new Stack<>();
        }
    
        public void add(int item) throws Exception{

            if(first.isEmpty()){
                first.push(item);
                return;
            }
            
            while(!first.isEmpty()){
                second.push(first.pop());
            }

            first.push(item);

            while(!second.isEmpty()){
                first.push(second.pop());
            }
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

        public int peek() throws Exception{
            return first.peek();
        }
        public boolean isEmpty(){
            return first.isEmpty();
        }
        
    }
    