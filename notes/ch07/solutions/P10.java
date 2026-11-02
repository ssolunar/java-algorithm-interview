package ch07.solutions;

import java.util.*;

// P10. 배열 파티션 I
// https://leetcode.com/problems/array-partition/
public class P10 {
    public int arrayPairSum(int[] nums) {
        // 정렬 후 이웃끼리 묶는 그리디 풀이
        Arrays.sort(nums);

        int ans = 0;

        for(int i = 0 ; i < nums.length ; i+=2){
            ans += nums[i];
        }
        return ans;
    }
}
