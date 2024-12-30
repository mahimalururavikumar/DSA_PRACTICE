package Stack.Stack1;

import java.util.*;

public class practice {

    //Stack Using ArrayList
    public static class StackB 
    {
        private ArrayList<Integer> al = new ArrayList<>();
        
        public boolean isEmpty(){
            return (al.size() == 0);
        }

        public void push(int data){
            al.add(data);
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = al.get(al.size()-1);
            al.remove(al.size()-1);
            return val;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return al.get(al.size()-1);
        }
    }
    
    //Stack Using Linked List
    public static class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class  Stack1 {
        static Node head = null;
        
        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head= newNode;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    
    public static String reverseString(String str){
        Stack<Character> s =new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder st= new StringBuilder();
        while (!s.isEmpty()) {
            st.append(s.pop());
        }
        return st.toString();
    }
    public static void main(String[] args) {

        //Stack1 s = new Stack1();
        String str = "ravi";
        System.out.print(reverseString(str));
    }
}
