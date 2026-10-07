package ch07.solutions;

import java.util.HashMap;
import java.util.Map;

public class P7 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],i);
        }

        for(int i = 0 ; i < nums.length ; i++) {
            int r = target - nums[i];

            if(map.containsKey(r) && map.get(r) != i ){
                return new int[] {i, map.get(r)};
            }
        }

        return null;
    }

}
