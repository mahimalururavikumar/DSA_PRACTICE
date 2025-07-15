package BitManupulation;

public class practice {

    public static void Basics(){
        //5 = 101 AND
        //6 = 110
        //----------------
        //& = 100  AND operation value = 4
        System.out.println(5&6);

        //5 = 101 OR Operation
        //6 = 110
        //| = 111  OR operation value = 7
        System.out.println(5|6);

        //5 = 101 XOR Operation
        //6 = 110
        //^ = 011  XOR operation value = 3
        System.out.println(5^6);

        //~5 = 00000101 ---Binary 1's compliment
        //2's(11111010) compliment = 1's(00000101) compliment and add 1=00000110
        System.out.println(~5);

        //5(00000101) left shift
        //result = 00010100 move towards left and remove elements from left
        //formula a<<b = a*2^b
        System.out.println(5<<2);

        //5(00000101) right shift 
        //result = 00000010 move towards right and remove elements from right
        //formula a<<b = a/2^b
        System.out.println(5>>1);
    }
    
    public static void EvenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }
    }
    
    public static void getIbit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }

    public static int setIbit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    
    public static int clearIbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIbit(int n,int i,int newBit){
        n = clearIbit(n, i);
        newBit = newBit<<i;
        return n | newBit;

    }

    public static int clearIbits(int n,int i){
        int bitmask = (-1<<i);
        System.out.println(bitmask);
        return n & bitmask;
    }
    
    public static int clearRangeOfBits(int n,int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int c = a | b;
        return n & c;
    }
    
    public static boolean checkIfpower(int n){
        return  (n & (n-1)) == 0;
    }
    
    public static int CountSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    
    public static int fastExponential(int a,int n){
        int ans = 1;
        while (n>0) {
            if((n & 1) != 0){
                ans = ans * a;
            }
            a =a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(checkIfpower(5));
    }
}
