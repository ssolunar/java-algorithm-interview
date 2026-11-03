package ch07.solutions;

import java.util.*;

// P11. 자신을 제외한 배열의 곱 (2026-11-03)
// https://leetcode.com/problems/product-of-array-except-self/
public class P11 {
    public int[] productExceptSelf(int[] nums) {
        // 결과 배열에 왼쪽 곱 저장, 입력 배열에 오른쪽 누적 곱 저장
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length ; i++){
            if(i==0) ans[i] = 1;
            else{
                ans[i] = ans[i-1]*nums[i-1];
            }
        }
        for(int i = nums.length-1; i >= 0 ; i--){
            if(i==nums.length-1) continue;
            else{
                nums[i] = nums[i] *nums[i+1];
                ans[i] *= nums[i+1];
            }

        }
        return ans;
    }
}
