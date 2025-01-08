package Queue.QueueWithLL;

public class practice {

    static class  Node {
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class  Queue {
        static Node head;
        static Node tail;
        
        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove(){
            if(isEmpty()){
                return -1;
            }
            Node temp = head;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return temp.data;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
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
