package ch07.solutions;

// P8 1차 시도 (2026-11-05): 높이별로 오른쪽 벽 탐색
// 제출 결과: 시간 초과. 원본 시도 보존용으로, 정답 풀이가 아니다.
// 주의: p가 배열 끝에 도달해도 반복을 멈추지 않아 범위 초과 가능성이 있다.
public class P8_v1 {
    public int trap(int[] height) {
        int ans = 0;

        for (int i = 0; i < height.length - 1; i++) {
            int high = height[i];
            int w = 0;

            for (int h = high; h > 0; h--) {
                int p = i + 1;
                if (h <= height[p]) break;
                while (h > height[p]) {
                    w++;
                    p++;
                    if (p >= height.length) {
                        w = 0;
                    }
                }
            }
            ans += w;
        }
        return ans;
    }
}
