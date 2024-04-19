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

        head = newNode;
        System.out.println("Value inserted at head successfully\n");

    }

    public void insertAtTail(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;


        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Value inserted at tail successfully\n");
    }

    public void insertAtParticularPosition(int value, int position){

        Node newNode = new Node();
        newNode.value = value;
        
        if(position == 1 || head == null){
            newNode.next = head;
            head = newNode;

        }else{
            Node currentNode = head;
            int flag = 1;
            while(flag < position -1 && currentNode != null){
                currentNode = currentNode.next;
                flag++;

            }

            if(currentNode!= null){
                //ensure position is valid
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                System.out.println("Your value is inserted at " + position + " position successfully\n");
            }
            else{
                System.out.println("Invalid position\n");
            }
        }

        


    }


    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.value+ "-->");
            current = current.next;
        }
    }





    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter data to insert at head");
    //     // int value = sc.nextInt();
    //     // ll.insertAtHead(value);
    //     ll.insertAtHead(5);
    //     // ll.insertAtHead(10);
    //     // ll.insertAtHead(15);
        
        
    //     ll.insertAtTail(15);
    //     ll.insertAtTail(25);
    //     ll.insertAtTail(35);

    //     // ll.insertAtParticularPosition(55, 2);

    //     System.out.println("Data in linked list");
    //    ll.print();


       
    int choice;
    do{
        System.out.print("1. To insert at head.\n2. To insert at tail.\n3. To insert at particular postion.\n4. To Print the Data in Linkedlist\n0. To Exit....\n\n");
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
            {
                System.out.println("Enter the value to insert at head");
                int value = sc.nextInt();
                ll.insertAtHead(value);
                break;

            }
            case 2:
            {
                System.out.println("Enter the value to insert at tail");
                int value = sc.nextInt();
                ll.insertAtTail(value);
                break;
                
            }
            case 3:
            {
                System.out.println("Enter the position where you want to insert the data");
                int position = sc.nextInt();
                System.err.println("Enter the value to insert at " +position + " position");
                int value = sc.nextInt();
                ll.insertAtParticularPosition(value, position);
                break;

            }
            case 4 :
            {
                System.out.println("Data in the linkedList => ");
                ll.print();
                System.out.println();
                break;
            }

            case 0:
            {
                System.out.println("Exiting the program");
                break;

            }
            default :
            {
                System.out.println("Please enter the correct choice");
            }
        }

       }while(choice!=0);



       

    }
}
