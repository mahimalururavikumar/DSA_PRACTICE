package Stack.Assign1;

import java.util.Stack;

public class practice {
    
    public static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public static void add(char data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean Palindrome(){
        Stack<Character> s = new Stack<>();

        Node temp = head;
        
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        while (!s.isEmpty() && temp != null) {
            char ch = s.pop();
            if(ch != temp.data){
                return false;
            }
            temp = temp.next;
        }
        if(!s.isEmpty() && temp == null){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        add('a');
        add('b');
        add('b');
        add('c');
        add('b');
        add('b');
        add('a');
        print();
        System.out.print(Palindrome());
    }
}
