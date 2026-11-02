package ch07.solutions;

import java.util.*;

public class P9 {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums); // index 안중요하니까. sort갈겨

            List<List<Integer>> ans = new ArrayList<>();

            for(int i = 0 ; i < nums.length-2 ; i++){
                if(i>0 && nums[i] == nums[i-1]) continue;

                // 투포인터
                int l = i+1;
                int r = nums.length-1;

                //
                while(l<r){
                    int sum = nums[i] + nums[l] + nums[r];
                    if(sum > 0) r--;
                    else if(sum < 0) l++;
                    else {
                        ans.add(Arrays.asList(nums[i],nums[l],nums[r]));

                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;

                        r--;
                        l++;
                    }
                }

            }

            return ans;
        }
}
