package ch07.solutions;

// P8 2차 시도 (2026-11-06): 위치마다 양쪽 최고 벽 탐색
// 제출 결과: 시간 초과. 시간 O(n²), 추가 공간 O(1).
public class P8_v2 {
    public int trap(int[] height) {
        int ans = 0;

        for (int i = 1; i < height.length - 1; i++) {
            int l = i - 1;
            int r = i + 1;
            int ml = -1, mr = -1;

            while (l >= 0) {
                if (height[i] < height[l]) {
                    if (ml < height[l]) ml = height[l];
                }
                l--;
            }
            while (r < height.length) {
                if (height[i] < height[r]) {
                    if (mr < height[r]) mr = height[r];
                }
                r++;
            }

            int w = 0;
            if (ml != -1 && mr != -1) {
                int h = (ml > mr) ? mr : ml;
                w = h - height[i];
            }
            ans += w;
        }
        return ans;
    }
}
