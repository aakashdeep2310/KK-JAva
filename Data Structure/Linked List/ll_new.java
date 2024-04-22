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

            Node node = new Node(value);
            if(tail == null){
                insertFirst(value); // then call insertFirst method to insert the first element
                return;
            }
            tail.next = node;
            tail = node;
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

        //insert using recursion
        public void insertRec(int val, int index){
            head = insertRec(val, index, head);
        }

        private Node insertRec(int val, int index, Node node){
            if(index == 0){
                Node temp = new Node(val, node);
                size++;
                return temp;
            }

            node.next = insertRec(val, index-1, node.next);
            return node;
        }

        /* ********************* */

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


        // public Node findNode(int val){ // to find the value at which node
    // =======
        public Node findNode(int val){
    // >>>>>>> fe79f17d8045ff08cd269902341/02f2a913e428c
            Node node = head;
            while (node != null) {
                if(node.value == val){
                    return node;
                }
                node = node.next;
                
            }
            return null;
        }


        // public Node get(int index){ // to find the value of node at any index

        public Node get(int index){

            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
                
            }
            return node;

        }

        public static void main(String[] args) {
        ll_new list = new ll_new();
        //    list.insertFirst(3);
        //    list.insertFirst(2);
        //    list.insertFirst(8);
        //    list.insertFirst(17);
        //    list.insertFirst(17);
        //    list.insertFirst(17);
        //    list.insertLast(99);
        //    list.insertAtindex(100, 3);
        //    list.display();
        //    System.out.println(list.deleteFirst());
        //    list.display();
        //    System.out.println(list.deleteLast());
        //    list.display();
        //    System.out.println(list.deleteIndex(2));
        //    list.display();

        //    list.insertRec(7, 3);
        //    list.display();

        //for removing duplicates
        // list.insertFirst(4);
        // list.insertFirst(4);
        // list.insertFirst(2);
        // list.insertFirst(1);
        // list.insertFirst(1);


        // list.insertLast(1);
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(3);

        // list.display();
        // list.removeDuplicates();
        //     list.display();
        


        // for merging two sorted linkedlist
        ll_new first = new ll_new();
        ll_new second = new ll_new();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        list.display();
        ll_new ans = ll_new.merge(first, second);
        ans.display();


        }

        // LeetCode Question
        // Remove Duplicates from linked list (from sorted LinkedList)

        public void removeDuplicates(){
            Node node = head;

            while(node.next != null){
                if(node.value == node.next.value){
                    node.next = node.next.next;
                    size--;
                } else{
                    node = node.next;
                }
            }
            tail = node;
            tail.next  = null;
        }


        // Merge two linked list 
        public static ll_new merge(ll_new first, ll_new second){
            Node f = first.head;
            Node s = second.head;

            ll_new ans = new ll_new();

            while(f != null && s != null){
                if(f.value < s.value){
                    ans.insertLast(f.value);
                    f = f.next;
                }else{
                    ans.insertLast(s.value);
                    s = s.next;
                }
            }

            while(f != null){
                ans.insertLast(f.value);    
                f = f.next;
            }
            
            while(s != null){
                ans.insertLast(s.value);    
                s = s.next;
                
            }

            return ans;
        }


        // Detect cycle in linked list
        public boolean hasCycle(Node head) {
            Node fast = head;
            Node slow = head;
    
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    return true;
                }
            }
            return false;
        }
        
        // find the length of the cycle
        public int cycleLength(Node head) {
            Node fast = head;
            Node slow = head;
            int count = 0;
    
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    // calculate the length
                    Node tempNode = slow;
                    int length = 0;

                    do{
                        tempNode = tempNode.next;
                        length++;
                    }
                    while(tempNode != slow);
                    return length;
                }
            }
            return 0;
        }
        

        public Node detectCycle(Node head) {
            int length = 0; 
            Node fast = head;
            Node slow = head;
    
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                        length = cycleLength(slow);
                        break;
                }
            }

            if(length == 0){
                return null;
            }

            // find the start node;
            Node first = head;
            Node second = head;

            while(length > 0){
                second = second.next;
                length--;
            }

            // keep moving both forward and they will meet at cycle start 
            while(first != second){
                first = first.next;
                second = second.next;
            }

            return second;

        }

        // Is Happy Number
        public boolean isHappy(int n){
            int slow = n;
            int fast = n;

            do{
                slow = findSquare(slow);
                fast = findSquare(findSquare(fast));
            } while (slow != fast);

            if(slow == 1){
                return true;
            }
            return true;
        }

        private int findSquare(int number){
            int ans = 0;
            while(number > 0){
                int rem = number % 10;
                ans += rem * rem;
                number /= 10;
            }
            return ans;
        }

        public Node middleNode(Node node){
            Node s = head;
            Node f = head;

            while(f != null && f.next != null){
                s = s.next;
                f = f.next.next;
            }
            return s;
        }


        public ListNode sortList(ListNode head){
            if(head == null || head.next == null){
                return head;
            }

            ListNode mid = getMid(head);
            ListNode left = sortList(head);
            ListNode right = sortList(mid);

            return merge(left, right);
        }

        ListNode merge(ListMode list1, ListNode list2){
            ListNode dummyHead = new ListNode();
            ListNode tail = dummyHead;
            While(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;
                } else {
                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
            }
            tail.next = (list1 != null) ? list1 : list2;
            return dummyHead.next;
        }

        
    }
