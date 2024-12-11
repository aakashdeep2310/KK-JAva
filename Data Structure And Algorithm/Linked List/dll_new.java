public class dll_new {
    
        private Node head;
        private Node tail;
        private int size;

        public dll_new(){
            this.size = 0;
        }

    private class Node {

        private int value;
        private Node next;
        private Node prev;

        public  Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


    public void insertFront(int value){
        Node node = new Node(value);
        node.prev = null;
        node.next = null;

        if(size == 0){
            head = node;   
        }
        if(tail == null){
            tail = head;
        }else{

            node.next = head;
            head.prev = node;
            head = node;
        }

        size+=1;
    }

    public void insertLast(int value){
        if(size == 0){
            insertFront(value);
        }else{
            Node node = new Node(value);
            node.next = null;
            node.prev = null;

            if(head == null){
                insertFront(value);
            }else{
                Node tail = head;
                while(tail.next != null){
                    tail = tail.next;
                }

                tail.next = node;
                node.prev = tail;

            }

        }
        size++;


    }

    public void insertAtlastPosition(int value){
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        System.out.println("Node inserted at last successfuly");


    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!= null){
            System.out.print(temp.value+ " -> ");
            last = temp; // while traversing when i reached temp at last make temp as last so we can locate where is last node
            temp = temp.next;
        }

        System.out.println("END");

        System.out.println("Print the linkedList in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

        System.out.println("Front");

    }

    public void insertAfter(int after, int val){// to insert after any node

        Node p = findNode(after);

        if(p == null){
            System.out.println("p does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if(node.next!=null){
            node.next.prev = node;
        }

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


    public static void main(String[] args) {
        dll_new list = new dll_new();
        list.insertFront(40);
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);

        // list.display();
        
        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        // list.display();
        
        list.insertAtlastPosition(100);
        // list.display();
        list.insertAfter(30, 10000);
        list.display();

        
    }
    
}
