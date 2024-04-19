import java.util.LinkedList;




public class ll_new {

    private Node head;
    private Node tail;
    private int size;

    public ll_new(){
        this.size = 0;
    }
    
    private class Node{

        private int value;
        private Node next;
        
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;

        head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void display(){
        Node temp = head;

        while
    }


    public static void main(String[] args) {
       ll_new list = new ll_new();
       list.insertFirst(5);
    }
    
}
