import java.util.Scanner;

public class SinglyLinkedList {

    public class Node {
        private int value;
        private Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }
    public void insertAtHead(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;

        if(head == null){
            head = newNode;
        }
        System.out.println("Data inserted Successfully");

    }

    public void insertAtTail(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;


        if(head == null){
            head = newNode;
        }else{
            Node current = new Node();
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Data inserted at last successfully");
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.value+ " ");
            current = current.next;
        }
    }



    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to insert at head");
        int value = sc.nextInt();
        ll.insertAtHead(value);
        
        
        ll.insertAtTail(value);

        System.out.println("Data in linked list");
       ll.print();

       

    }
}
