package Array.Arrays1;

import java.util.*;

public class creation {

    //LINEAR SEARCH
    public static void linearSearch(int arr[], int key) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
            } else {
                System.out.println("Not foud");
            }
        }
    }

    //LARGEST OF ARRAY
    public static int largestOfArray(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        
    }
    return largest;
}

   //SMALLEST OF ARRAY
    public static int smallestOfArray(int arr[]){
        int smallest = Integer.MAX_VALUE;

        for(int i =0;i< arr.length;i++){
            if(smallest > arr[i])
            {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    //BINARY SEARCH
    public static int BinarySearch(int arr[],int key){

        int start = 0;
        int end  = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    //REVERSE
    public static void reverse(int nums[]){
        int start = 0, end = nums.length - 1;
        while(start<end){
            int temp=nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    //PAIRS OF ARRAY
    public static void pairsOfArray(int nums[])
    {
        int n=nums.length;

        for(int i=0;i<=n-1;i++)
        {
            for(int j=1+i;j<n;j++)
            {
                System.out.print("("+nums[i]+","+nums[j]+") ");
            }
            System.out.println();
        }
    }

    //SUB ARRAY
    public static void subArray(int nums[])
    {
        int n=nums.length;
        int total = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++)
        {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=i;j<n;j++)
            {
                int start = i,end = j,sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                    sum = sum + nums[k];
                }
                total++;
                System.out.print("-----sum: "+sum);
                if(sum<min){
                    min = sum;
                }
                if(sum>max){
                    max= sum;
                }
                if(sum<minSum){
                    minSum = sum;
                }
                if(sum>maxSum){
                    maxSum= sum;
                }
                System.out.println();
            }
            System.out.println("minimum of sub Array with "+nums[i]+" is "+min);
            System.out.println("maximum of sub Array with "+nums[i]+" is "+max);
            System.out.println();
        }
        System.out.println("total sub Arrays are: "+total);
        System.out.println("maxSum of all subArrays are: "+maxSum);
        System.out.println("minSum of all subArrays are: "+minSum);
    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int marks[] = { 1, -2, 6, -1, 3};
        
        subArray(marks);
        
        sc.close();
    }
}
