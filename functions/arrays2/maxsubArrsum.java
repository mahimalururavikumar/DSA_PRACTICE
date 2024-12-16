package arrays2;

public class maxsubArrsum {

    //PREFIX ARRAY
    public static void prefixArr(int nums[])
    {
        int n=nums.length;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[nums.length];
        prefixArr[0] = nums[0];
        for(int i=1;i<prefixArr.length;i++)
        {
            prefixArr[i] = prefixArr[i - 1] + nums[i];
        }

        for(int i=0;i<=n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
               
                int start = i,end = j,currsum = 0;
                for(int k=start;k<=end;k++){
                    currsum = start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start - 1];
                }
                if(currsum>maxSum){
                    maxSum= currsum;
                }
            }
        }
        System.out.println(maxSum);
       
    }

    //KADANS
    public static void kadans(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<nums.length;i++)
        {
            currsum += nums[i];
            System.out.println(maxSum+" "+currsum);
            maxSum = Math.max(maxSum, currsum);

            if (currsum < 0) {
                currsum = 0;
            }
        }
        if (maxSum ==  0) {
            maxSum = nums[0];
            for (int num : nums)
            {
                maxSum = Math.max(maxSum,num);
            }
        }
        System.out.println("maximum sum is: "+maxSum);
    }

    //TRAPPING RAIN WATER
    public static void trappingWater(int num[]){

        int leftArr[] = new int[num.length];
        int rightArr[] = new int[num.length];
        //left max Auxillary Array
        leftArr[0] = num[0];
        for(int i=1;i<leftArr.length;i++){
           leftArr[i] = Math.max(leftArr[i-1],num[i]);
        }
        //Right max Auxillary Array
        rightArr[rightArr.length-1] = num[rightArr.length-1];
        for(int i=rightArr.length-2;i>=0;i--){
            rightArr[i] = Math.max(num[i],rightArr[i+1]);
        }
        //finding water capacity
        int drappedWater = 0;
        for(int i=0;i<num.length;i++){
            int water = Math.min(leftArr[i],rightArr[i]);
            drappedWater += water-num[i];
        }
        System.out.println("water capacity is: "+drappedWater);
    }
    
    //BUYANDSELLSTOCK
   public static void buyAndSellStock(int prices[]){
    int buyPrices = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i=0;i<prices.length;i++){
        if(buyPrices<prices[i]){
            int profit = prices[i] - buyPrices;
            maxProfit = Math.max(maxProfit, profit);
        }else{
            buyPrices = prices[i];
        }
    }
    System.out.println("Maximum Profit: "+maxProfit);
   } 
   
   //DUPLICATE TRIPLETS
   public static void duptriplets(int num[]){
    int n=num.length;
    for (int i=0;i<n;i++){
        for(int j=1+i;j<n;j++){
            for(int k=1+j;k<n;k++){
                if (num[i]+num[j]+num[k] == 0 ) {
                    System.out.print("["+num[i]+","+num[j]+","+num[k]+"] ,");
                }
            }
        }
    }
   }
   public static void main(String args[]) {

        int nums[] = {-2, -2, 0, 2};

        duptriplets(nums);;
    }
}
