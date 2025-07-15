package Deque.StackWithDeque;
import java.util.*;

public class practice {

    static class Stack{
        static Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void push(int data){
            dq.addLast(data);
        }

        public int pop(){
            if(dq.isEmpty()){
                System.out.println("stack is Empty");
                return -1;
            }
            return dq.removeLast();
        }

        public int peek(){
            if(dq.isEmpty()){
                System.out.println("stack is Empty");
                return -1;
            }
            return dq.getLast();
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
