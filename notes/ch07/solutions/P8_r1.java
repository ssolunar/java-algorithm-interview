package ch07.solutions;

// P8. 빗물 트래핑 - 1차 복습 (2026-11-10)
public class P8_r1 {
    public int trap(int[] height) {
        // TODO: 직접 구현하기
        int ans = 0;
        int l = 0, r=height.length-1;
        int maxL = height[l], maxR = height[r];

        while(l<r){
            int w = 0;
            if(height[l] > height[r]){
                maxR = Math.max(maxR, height[r]);
                w = maxR - height[r];
                ans+=w;
                r--;
            }
            else{
                maxL = Math.max(maxL, height[l]);
                w = maxL - height[l];
                ans+=w;
                l++;
            }
        }

        return ans;
    }
}
