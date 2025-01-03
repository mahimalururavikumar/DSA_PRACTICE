package Stack.Stack2;

import java.util.Stack;

public class practice {
    
    //find valid parentheses
    public static boolean findvalidParentheses(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if( (s.peek() == '(' && str.charAt(i) == ')') || 
                ( s.peek() == '[' && str.charAt(i) == ']') ||
                ( s.peek() == '{' && str.charAt(i) == '}')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
    public static boolean findDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if( ch == ')'){
                int count = 0;
                while ( s.pop() != '(' ) {
                    count++;
                }
                if(count < 1){
                    return false;
                }
            }else{
                s.push(ch);
            }
        }
        return true;
    }
    
    public static void maximumArea(){
        int arr[] = { 2, 1, 5, 6, 2, 3};
        Stack<Integer> s = new Stack<>();
        //left smaller
        int ls[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                ls[i] = -1;
            }else{
                ls[i] = s.peek();
            }
            s.push(i);
        }
        //right smaller
        s = new Stack<>();
        int rs[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                rs[i] = arr.length-1;
            }else{
                rs[i] = s.peek();
            }
            s.push(i);
        }

        //caluculate width
        int MAX = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int width = rs[i] - ls[i] - 1;
            int area = arr[i]*width;
            MAX = Math.max(MAX, area);
        }

        System.out.println("Maximum Area: "+MAX);
    }
    public static void main(String[] args) {
        
        // String str = "((){[]}{})";
        // System.out.print(findvalidParentheses(str));

        // String str = "((a)+(b))";
        // System.out.println(findDuplicate(str));

        maximumArea();
    }
}
