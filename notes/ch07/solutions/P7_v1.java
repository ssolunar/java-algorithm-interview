package ch07.solutions;

import java.util.*;

public class P7_v1 {
    public int[] twoSum(int[] nums, int target) {
        boolean[] visited = new boolean[nums.length];
        combination(nums,visited,0,nums.length,2,target);

        int[] result = new int[2];
        int a = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(visited[i]) result[a++] = i;
            else continue;
        }

        return result;
    }
    public boolean combination(int[] arr, boolean[] visited, int start, int n, int r, int target){
        //완성
        if(r==0){
            int sum=0;
            for(int i=0; i<arr.length ; i++){
                int w = (visited[i]) ? 1 : 0 ;
                sum += w * arr[i];
            }
            return sum == target;
        }

        for(int i = start; i<n ; i++){
            visited[i] = true;
            if(combination(arr,visited,i+1, n ,r-1, target)) return true;
            visited[i] = false;
        }
        return false;
    }
}
