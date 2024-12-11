public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;
        this.head = null;
        this.tail = null;
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


    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node; 

    }

    public void display(){
        Node current = head;
        if(head != null){

            do{
                System.out.print(current.value + " -> ");
                current = current.next;
                
            }
            while(current != head);
        }
        System.out.println("HEAD");


    }

    public void delete(int val){
        if(head == null){
            return;
        }
        head = head.next;
        tail.next = head;
    }

    public void deleteByValue(int value){
        
        Node node = head;
        if(node == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);

    }


    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        
        list.deleteByValue(40);
        list.display();

    }
    
}
