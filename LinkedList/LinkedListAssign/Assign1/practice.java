package LinkedList.LinkedListAssign.Assign1;

public class practice {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head1;
    public static Node head2;
    public static Node tail1;
    public static Node stail2;

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static int getLength(Node head) {
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static int findMerge(Node head1,Node head2){
        if(head1 == null || head2 == null){
            return -1;
        }

        int len1 = getLength(head1);
        int len2 = getLength(head2);
        Node temp1 = head1;
        Node temp2 = head2;
        if(len1 > len2){
            temp1 = skipNodes(head1, len1-len2);
        }else{
            temp2 = skipNodes(head2,len2-len1);
        }

        while (temp1 != null && temp2 != null) {
            if(temp1 == temp2){
                return temp1.data;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return  -1;
    }

    public static Node skipNodes(Node head,int count){
        Node temp = head;
        while (count > 0 && temp != null) {
            count--;
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        
        head1 = new Node(10);
        head1.next = new Node(12);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(24);
        printList(head1);
        head2 = new Node(14);
        head2.next = new Node(22);
        head2.next.next = head1.next.next.next;
        printList(head2);
        System.out.println(findMerge(head1, head2));
        // printList(head1);
        // printList(head2);
    }
}
