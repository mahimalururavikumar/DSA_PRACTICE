
//QUEUE USING ARRAY

package Queue.QueueWithArr;

public class practice {
    
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public boolean isFull(){
            return front == (rear+1)%size;
        }
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        //q.remove();
        System.out.println(q.remove()+" ");
        q.add(5);
        //System.out.println(q.remove()+" ");
        q.add(6);
        //q.add(7);
        //q.add(8);
        //q.add(9);
        System.out.println(q.peek());
        // while (!q.isEmpty()) {
        //     System.out.println(q.remove()+" ");
        // }
        
    }
}