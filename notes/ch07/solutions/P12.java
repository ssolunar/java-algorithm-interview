package ch07.solutions;

// P12. 주식을 사고팔기 가장 좋은 시점 (2026-11-05)
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class P12 {
    public int maxProfit(int[] prices) {
        // 지금까지의 최저 가격과 최대 이익을 기록한다.

        int ans = 0;
        int min = prices[0];

        for(int i = 1; i<prices.length; i++){
            // 손해
            if(prices[i] <= min){
                min = prices[i];
                continue;
            }
            // 이익
            else{
                int profit = prices[i] - min;
                if(profit > ans) ans = profit;
            }
        }
        return ans;
    }
}
