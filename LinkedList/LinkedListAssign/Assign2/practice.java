package LinkedList.LinkedListAssign.Assign2;

import java.util.LinkedList;

public class practice {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        System.out.print("HEAD->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void delMNnodes(int M, int N) {
        Node temp = head;
        while (temp != null) {

            for (int retain = 1; retain < M && temp != null; retain++) {
                temp = temp.next;
            }
            if (temp == null) {
                return;
            }
            Node curr = temp.next;
            for (int del = 1; del <= N && curr != null; del++) {
                curr = curr.next;
            }
            
            temp.next = curr;
            temp = curr;
            
        }
    }

    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head, t;
        int count;
        while (curr != null) {
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;
            if (curr == null)
                return;
            t = curr.next;
            for (count = 1; count <= N && t != null; count++) {
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
    }

    public static void delMNodesAftNnodes(LinkedList<Integer> ll, int M, int N) {
        int i = 0;
        int iterations = 0;
        while (i < ll.size()) {
            if (iterations >= M) {
                int NoOfDelNodes = 1;
                while (NoOfDelNodes <= N) {
                    ll.remove(i);
                    NoOfDelNodes++;
                }
                iterations = 0;
            } else {
                i++;
                iterations++;
            }
        }
    }

    public static void delNodes(LinkedList<Integer> ll, int M, int N) {
        int i = 0;
        while (i < ll.size()) {
            for (int retain = 0; retain < M && i < ll.size(); retain++) {
                i++;
            }
            for (int del = 0; del < N && i < ll.size(); del++) {
                ll.remove(i);
            }
        }
    }

    // public static void main(String[] args) {
    // LinkedList<Integer> ll = new LinkedList<>();
    // ll.add(20);
    // ll.addFirst(10);
    // ll.addLast(30);
    // ll.addLast(40);
    // ll.add(50);
    // ll.add(60);
    // ll.add(70);
    // ll.add(80);
    // System.out.println(ll);
    // delMNodesAftNnodes(ll,2,2);
    // System.out.println(ll);
    // }

    public static void main(String[] args) {

        practice ll = new practice();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        ll.delMNnodes(2,2);
        ll.print();
    }

}
