package ArrayList.Assign2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class practice {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();
        for(int num: nums){
            if( frequencyMap.get(num) == 1 && !frequencyMap.containsKey(num-1) && !frequencyMap.containsKey(num+1)){
                lonelyNumbers.add(num);
            }
        }
        return lonelyNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(10,6,5,8));
        System.out.println(findLonely(nums));
        // nums.add(1);
        // nums.add(3);
        // nums.add(5);
        // nums.add(3);
    }
}
