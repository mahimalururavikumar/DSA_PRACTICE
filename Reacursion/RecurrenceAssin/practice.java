package Reacursion.RecurrenceAssin;

public class practice {

    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void digitToNumber(int n){
        if(n == 0)
        {
            return;
        }
        int lastDigit = n%10;
        n = n/10;
        digitToNumber(n);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void OccIndexes(int arr[],int key,int i)
    {
        if(i == arr.length)
        {
            return;
        }
        if(arr[i] == key)
        {
            System.out.print(i+"  ");
        }
        i++;
        OccIndexes(arr, key, i);
    }
    
    public static void subStringCount(int i,int j,String str,StringBuilder newstr,int count){

        if(i == str.length()){
            System.out.println(count);
            return;
        }

        if((j == str.length()))
        {
            subStringCount(i + 1, i + 1, str, new StringBuilder(), count);
            return;
        }
    
        newstr.append(str.charAt(j));
        if(newstr.charAt(0) == newstr.charAt(newstr.length()-1))
        {
            count++;
        }
        subStringCount(i,j+1,str,new StringBuilder(newstr),count);
    }
    
    public static int DecToBinary(int n){
        if(n == 0){
            return 0;
            //return "";
        }
        return ( 10 * DecToBinary(n/2) + n%2 );
        //return (DecToBinary(n/2) + n%2);
    }
    
    public static int ArrSum(int arr[],int N){
        if(N <= 0){
            return 0;
        }
        return (ArrSum(arr,N-1)+arr[N-1]);
    }
    
    public static String revOfString(String str){
        if(str.length() == 1){
            return ""+str.charAt(0);
        }
        return (""+str.charAt(str.length()-1)+revOfString(str.substring(0, str.length()-1)));

        // if (str.length() == 1){
        //     System.out.print(str.charAt(0));
        // }else{
        // System.out.print(str.charAt(str.length()-1));
        // revOfString(str.substring(0, str.length()-1));
        // }
    }
    
    public static int StringCount(String str){
        if(str.equals("")){
            return 0;
        }
        return StringCount(str.substring(1))+1;
    }
    
    public static int SumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n%10+SumOfDigits(n/10));
    }
    
    public static void Fibonaaci(int n){
        if(n == 1){
            System.out.print(n+" ");
        }
        if(n == 0){
            System.out.print(n+" ");
        }
        //int f = Fibonaaci(n-1)+Fibonaaci(n-2);
        System.out.print(n+" ");
    }
    
    public static int MaxArr(int arr[],int n){
        if(n == 1){
            return arr[0];
        }
       return Math.max(arr[n-1], MaxArr(arr, n-1));
    }
    
    public static String Palindrome(String str, String pal){
        if(str.length() == 1){
            return pal += str.charAt(0);
        }
        pal += str.charAt(str.length()-1);
        Palindrome((str.substring(0, str.length()-1)), pal);
        return pal;
    }
    
    public static int CountSet(int n){
        if( n  == 0){
            return 0;
        }
        if( (n & 1) == 1){
            return ( 1 + CountSet( n >> 1));
        }else{
            return CountSet( n >> 1);
        }
    }
    public static void main(String[] args) {
        // int arr[] = {7, 2,-5, 5, 8, 2, 10, -2, -4};
        // OccIndexes(arr, 7, 0);
        //digitToNumber(1947);
        // String str = "abcab";
        // subStringCount(0, 0, str, new StringBuilder(""), 0);
        //System.out.println(revOfString("ravi"));
        //System.out.println(MaxArr(arr, arr.length));
        System.out.println(CountSet(21));
    }
}
