package ch07.solutions;

// P8. 빗물 트래핑 (2026-11-05)
// https://leetcode.com/problems/trapping-rain-water/
public class P8 {
    public int trap(int[] height) {
        // 투 포인터: 양쪽 최고 벽을 갱신한 뒤 낮은 쪽의 물을 확정한다.
        int ans = 0;
        int l = 0, r = height.length-1;
        int maxL = height[l], maxR = height[r];

        while(l<r){
            // update
            maxR = Math.max(maxR, height[r]);
            maxL = Math.max(maxL, height[l]);

            if(maxL > maxR){
                // water
                int w = maxR - height[r];
                ans += w;
                r--;
            }
            else{
                //water
                int w = maxL - height[l];
                ans += w;
                l++;
            }
        }
        return ans;
    }
}
