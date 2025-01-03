package LinkedList.LinkedListAssign.Assign3;


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

    public static void add(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){
        Node temp = head;
        System.out.print("HEAD->");
        while (temp !=  null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    public static void swappingNodes(int x,int y){

        Node prex = null,prey = null,currx = head,curry = head;
        while (currx != null && currx.data != x) {
            prex = currx;
            currx = currx.next;
        }
        while (curry != null && curry.data != y) {
            prey = curry;
            curry = curry.next;
        }
        if(prex == null){
            head = curry;
        }else{
            prex.next = curry;
        }
        if(prey == null){
            head = currx;
        }else{
            prey.next = currx;
        }
        Node temp = currx.next;
        currx.next = curry.next;
        curry.next = temp;
    }

    public static void main(String[] args) {
        
        add(1);
        add(2);
        add(3);
        add(4);
        print();
        swappingNodes(1, 4);
        print();
    }
}
