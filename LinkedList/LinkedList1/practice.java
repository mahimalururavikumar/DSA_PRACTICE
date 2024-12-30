package LinkedList.LinkedList1;

public class practice {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if( head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    
    public void printList(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        System.out.print("HEAD->");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public void addNode(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while ( i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
   
    public int removeLast(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return -1;
        }else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }else{
            Node prev = head;
            for(int i=0;i<size-2;i++){
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    }
    
    public int findKey(int key){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return -1;
        }else if(size == 1){
            return 0;
        }else{
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }

    }
    
    public int recFindKey(int key){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return -1;
        }else if(size == 1){
            return 0;
        }else{
            Node temp = head;
            return recursiveSearch(temp,0,key);
        }
    }

    public int recursiveSearch(Node temp,int i,int key){
        if(temp == null){
            return -1;
        }
        if(temp.data == key){
            return i;
        }else{
            temp = temp.next;
            return recursiveSearch(temp,i+1,key);
        }
    }
    
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public void delNthNodeFromEnd(int n){
        int sz = 0;

        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        int i = 1;
        int NodeToFind = sz - n;
        Node prev = head;
        while (i < NodeToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Boolean checkPalindrome(){
        if( head  == null || head.next == null){
            return true;
        }

        Node midNode = findMid(head);

        //reverse right part
        Node prev = null;
        Node curr = midNode;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //check palindrome

        while (right != null) {
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static void main(String[] args) {
        // practice ll = new practice();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addNode(2,3);
        // ll.printList();
        // System.out.print(ll.checkPalindrome());
        head = new Node(1);
        //ll.printList();
        //System.out.println(size);
    }
}
