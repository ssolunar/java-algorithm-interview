package ch07.solutions;

// P8. 빗물 트래핑 (2026-11-05)
// https://leetcode.com/problems/trapping-rain-water/
public class P8_v3 {
    public int trap(int[] height) {
        // 3차 시도: 접두·접미 최댓값 배열. 통과, 시간 O(n), 추가 공간 O(n).
        int ans = 0;
        int[] maxleft = new int[height.length];
        int[] maxright = new int[height.length];

        // prefix
        for(int i=1; i < height.length-1 ; i++){
            maxleft[i] = (maxleft[i-1] > height[i-1]) ? maxleft[i-1] : height[i-1];
        }
        // suffix
        for(int i=height.length-2; i> 0; i--){
            maxright[i] = (maxright[i+1] > height[i+1]) ? maxright[i+1] : height[i+1];
        }

        // water
        for(int i=1; i < height.length-1; i++){
            if(height[i] < maxleft[i] && height[i] < maxright[i]){
                int h = (maxleft[i] > maxright[i]) ? maxright[i] : maxleft[i];
                ans += h - height[i];
            }
        }
        return ans;
    }
}
