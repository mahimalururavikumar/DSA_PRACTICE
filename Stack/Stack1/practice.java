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

    public static class Stack1 {
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
            head = newNode;
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
    
    public static void pushAtBottom(Stack1 s,int data){
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
    
    public static void reverse(Stack1 s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }
    
    public static void printStack(Stack1 s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    //stock span in O(n2)
    public static void stockSpan(){
        int arr[] = {100, 80, 60, 70, 60, 85, 100};

        int span[] = new int[arr.length];
        span[0] = 1;
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i] > arr[j]){
                    span[i] = span[i] + 1;
                }else{
                    span[i] = span[i] + 1;
                    break;
                }
            }
        }
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }

    //stock span in O(n)
    public static void StockSpan(int stock[],int span[]){

        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice >= stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i + 1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void nextGreater(){
        int arr[] = { 5, 2, 1, 4, 3, 6};
        int nxtGrter[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                nxtGrter[i] = -1;
            }else{
                nxtGrter[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtGrter.length;i++){
            System.out.print(nxtGrter[i]+" ");
        }
    }

    public static void main(String[] args) {
        // Stack1 s = new Stack1();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(0);
        // //reverse(s);
        // printStack(s);


        // int stock[] = {100, 80, 60, 70, 60, 85, 100};

        // int span[] = new int[stock.length];
        // StockSpan(stock,span);
        // for(int i=0;i<span.length;i++){
        //     System.out.print(span[i]+" ");
        // }

        nextGreater();
    }
}
