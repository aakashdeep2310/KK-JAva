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

        
        

    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }

        System.out.println("END");

    }




    public static void main(String[] args) {
        dll_new list = new dll_new();
        list.insertFront(40);
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);

        list.display();
        
        list.insertLast(50);
        list.insertLast(60);
        list.insertLast(70);
        list.display();
        
    }
    
}
