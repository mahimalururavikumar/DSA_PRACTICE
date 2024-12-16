package Recursion;

public class practice {

    //Print first N numbers in decresing using recursion
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }

    //Print first N numbers in Incresing using recursion
    public static void printInc(int n)
    {
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    //Factorial
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        n = n*factorial(n-1);
        return n;
    }

    //SumOfFirst 'N' numbers
    public static int sumOfFirstN(int n)
    {
        if(n == 1){
            return 1;
        }

        n = n + sumOfFirstN(n-1);
        return n;
    }

    //Fibanooci series
    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1){
            return n;
        }
        n = fibonacci(n-1) + fibonacci(n-2);
        return n;
    }
    
    //check an array is sorted or not
    public static boolean sortedArr(int arr[],int i)
    {
        if(i == (arr.length-1))
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return sortedArr(arr, i+1);
    }
   
    //Find first occurence of element
    public static int firstOccurence(int arr[],int key,int i)
    {
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return firstOccurence(arr, key, i+1);
    }
   
    //Find power of number
    public static int xPowerN(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return x*xPowerN(x, n-1);
    }
    
    //Finding power optimized
    public static int optmizedPower(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int half  = optmizedPower(x, n/2);
        if(n%2 != 0)
        {
            return x*half*half;
        }
        return half*half;
    }
    public static void main(String[] args) {
        //int arr[] = {1, 4, 7, 11, 12};
        System.out.println(optmizedPower(2,11));
    }
}
