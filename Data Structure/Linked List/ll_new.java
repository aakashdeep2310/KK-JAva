import java.util.LinkedList;
import java.util.NoSuchElementException;




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

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value); // then call insertFirst method to insert the first element
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        size++;

    }

    public void insertAtindex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next; // we have to go till < index to insert value at index
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        } else if (size == 1) {
            return deleteFirst();
        } else {
            Node secondLast = get(size - 2);
            int val = tail.value;
            tail = secondLast;
            tail.next = null; 
            size--;
            return val;
        }
    }

    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
            
        }
        if(index == size - 1){
            return deleteLast();
        }

         Node prev = get(index - 1);
         int value = prev.next.value;

         prev.next = prev.next.next;

         return value;
    }

    public Node findNode(int val){ // to find the value at which node
        Node node = head;
        while (node != null) {
            if(node.value == val){
                return node;
            }
            node = node.next;
            
        }
        return null;
    }

    public Node get(int index){ // to find the value of node at any index
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
            
        }
        return node;

    }

    public static void main(String[] args) {
       ll_new list = new ll_new();
       list.insertFirst(3);
       list.insertFirst(2);
       list.insertFirst(8);
       list.insertFirst(17);
       list.insertLast(99);
       list.insertAtindex(100, 3);
       list.display();
       System.out.println(list.deleteFirst());
       list.display();
       System.out.println(list.deleteLast());
       list.display();
       System.out.println(list.deleteIndex(2));
       list.display();

      

    }
    
}
