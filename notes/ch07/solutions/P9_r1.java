package ch07.solutions;

import java.util.*;

// P9. 세 수의 합 - 1차 복습 (2026-11-02)
// https://leetcode.com/problems/3sum/
public class P9_r1 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = nums.length - 1 ;

            while(l<r ){
                if (nums[i] + nums[l] + nums[r] < 0) l++;
                else if(nums[i] + nums[l] + nums[r] > 0) r--;
                else {// 0일때
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;

                    l++;
                    r--;

                }
            }
        }

        return ans;
    }
}
