package Problem_121__Best_Time_to_Buy_and_Sell_Stock.Java;

public class Solution3 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0; // 初始化第零天為買入日

        // 賣出日從第一天開始往後計算獲利
        for (int r = 1; r < prices.length; r++) {
            // 若發現賣出日價格更低，更新買入日為目前最低價
            if (prices[r] < prices[l]) {
                l = r;
                continue;
            }

            // 否則計算目前獲利，並更新最大獲利
            int profit = prices[r] - prices[l];
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
