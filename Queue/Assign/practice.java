package Queue.Assign;

import java.util.*;

public class practice {



    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < n; i++) {

            String binary = q.poll();
            System.out.print(binary + " ");
            q.add(binary + "0");
            q.add(binary + "1");
        }
    }

    public static int minCost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int res = 0;

        while(pq.size() > 1)
        {
            int first = pq.poll();
            int second = pq.poll();

            res += first + second;
            pq.add(first+second);
        }
        return res;
    }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number");
    // int N = sc.nextInt();
    // generateBinary(N);
    // sc.close();
    // }

    // Connect n ropes with minimum cost
    public static void main(String args[]) {
        int len[] = { 4, 3, 2, 6 };
        int size = len.length;
        System.out.println("Total cost for connecting"
                + " ropes is "
                + minCost(len, size));
    }
}
