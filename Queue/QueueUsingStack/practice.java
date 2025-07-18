package Queue.QueueUsingStack;

import java.util.Stack;

public class practice {
    
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // public void add(int data){
        //     while (!s1.isEmpty()) {
        //         s2.push(s1.pop());
        //     }

        //     s1.push(data);

        //     while (!s2.isEmpty()) {
        //         s1.push(s2.pop());
        //     }
        // }

        // public int remove(){
        //     return s1.pop();
        // }

        public void add(int data){

            s1.push(data);
        }

        public int remove(){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int n = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return n;
        }

        public int peek(){
            return s1.peek();
        }
    }
    
    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
