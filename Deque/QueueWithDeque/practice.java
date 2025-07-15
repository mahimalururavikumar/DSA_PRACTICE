package Deque.QueueWithDeque;

import java.util.*;

public class practice {

    static class Queue{
        static Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
        
            if(dq.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.removeFirst();
        }

        public int peek(){
            if(dq.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return dq.getFirst();
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}

