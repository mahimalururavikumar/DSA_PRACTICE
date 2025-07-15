package Stack.StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class practice {
    
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static class Stack {
    
        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data){
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        public int pop(){
            return q1.remove();
        }

        public int peek(){
            return q1.peek();
        }
        // public void push(int data){
        //     if(!q1.isEmpty()){
        //         q1.add(data);
        //         System.out.println(data);
        //     }else{
        //         q2.add(data);
        //         System.out.println(data);
        //     }
        // }

        // public int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int data = -1;
        //     if(!q1.isEmpty()){
        //         while (!q1.isEmpty()) {
        //             data = q1.remove();
        //             if(q1.isEmpty()){
        //                 break;
        //             }
        //             q2.add(data);
        //         }
        //     }else{
        //         while (!q2.isEmpty()) {
        //             data = q2.remove();
        //             if(q2.isEmpty()){
        //                 break;
        //             }
        //             q1.add(data);
        //         }
        //     }
        //     return data;
        // }

    //     public int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int data = -1;
    //         if(!q1.isEmpty()){
    //             while (!q1.isEmpty()) {
    //                 data = q1.remove();
    //                 q2.add(data);
    //             }
    //         }else{
    //             while (!q2.isEmpty()) {
    //                 data = q2.remove();
    //                 q1.add(data);
    //             }
    //         }
    //         return data;
    //     }
    }
    
    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
