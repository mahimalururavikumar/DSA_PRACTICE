package Array.ArrayList.Assign3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice {
    
    public static void MFNK(ArrayList<Integer> nums,int key){

        HashMap<Integer,Integer> frequnceyCount = new HashMap<>();

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i) == key){
                frequnceyCount.put(nums.get(i+1), frequnceyCount.getOrDefault(nums.get(i+1), 0)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequnceyCount.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey());
        }
    }
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>(List.of(2,2,2,2,3));
        MFNK(nums, 2);
    }
}
