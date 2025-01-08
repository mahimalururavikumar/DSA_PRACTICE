package LinkedList.LinkedListAssign.practice;

public class practice {
    static Node head;
    static Node tail;
    public static class  Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void printList(){
        Node curr = head;
        while ( curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static void delLastOccurence(int key){
        Node curr = head,last = null,lastPrev = null,prev = null;
        while (curr != null) {
            if(curr.data == key){
                last = curr;
                lastPrev = prev;
            }
            prev = curr;
            curr = curr.next;
        }
        if(last != null){
            if(lastPrev != null){
                lastPrev.next = last.next;
            }else{
                head = head.next;
            }
        }else{
            System.out.println("Element Not Found");
        }
    }
    
    public static void main(String[] args) {
        add(2);
        add(2);
        add(3);
        add(4);
        add(1);
        add(5);
        printList();
        delLastOccurence(6);
        printList();
    }
}
