package arrayAssignment;

import java.util.HashSet;

public class assign {

    public static Boolean checkRepeat(int nums[]){
        //using Hashset
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
            // for(int j=1+i;j<nums.length;j++){
            //     if(nums[j] == nums[i]){
            //         return true;
            //     }
            // }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};

        System.out.println(checkRepeat(nums));
    }
}
