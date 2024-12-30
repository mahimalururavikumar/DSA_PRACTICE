package LinkedList.LinkedList2;

//import java.util.LinkedList;

public class practice {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        System.out.print("HEAD->");
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static Boolean checkCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle =  true;
                break;
            }
        }
        if (cycle) {
            slow = head;
            Node prev = null;
            while (slow != fast) {
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev.next = null;
        }
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMid(head);
        Node rightNode = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightNode);

        return merge(newLeft,newRight);
    }

    public Node merge(Node LeftNode,Node rightNode){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (LeftNode != null && rightNode != null) {
            if( LeftNode.data < rightNode.data){
                temp.next = LeftNode;
                LeftNode = LeftNode.next;
                temp = temp.next;
            }else{
                temp.next = rightNode;
                rightNode = rightNode.next;
                temp = temp.next;
            }
        }
        while (LeftNode != null) {
            temp.next= LeftNode;
            LeftNode = LeftNode.next;
            temp = temp.next;
        }
        while (rightNode != null) {
            temp.next = rightNode;
            rightNode = rightNode.next;
            temp = temp.next;
        }
        return mergedll.next;
    }
    
    public void zigzag(){
        //Find Mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse the 2nd part

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while( curr != null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;
        Node nextL,nextR;
        // Zig Zag merge
        while (leftHead != null &&  rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
    }

    public static void main(String[] args) {
        
        practice ll = new practice();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}
