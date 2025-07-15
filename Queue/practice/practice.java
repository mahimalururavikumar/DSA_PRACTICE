package Queue.practice;
import java.util.*;
public class practice {
    
    public static void firstNonRepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
            
            if(q.isEmpty()){
                System.out.print("-1 ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    
    public static void interleaveQueue(Queue<Integer> q){
        if(q.size()%2 != 0){
            System.out.println("Queue should contain even number of values");
            return;
        }
        int firstHalf = q.size()/2;
        Queue<Integer> firstQueue = new LinkedList<>();
        for(int i=0;i<firstHalf;i++){
            firstQueue.add(q.poll());
        }
        while (!firstQueue.isEmpty()) {
            q.add(firstQueue.poll());
            q.add(q.poll());
        }

    }

    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.poll());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        
        // String str = "cbdabcd";
        // firstNonRepeating(str);
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++)
        {
            q.add(i);
            
        }
        System.out.println(q);
        //interleaveQueue(q);
        reverse(q);
        System.out.println(q);
    }
}
