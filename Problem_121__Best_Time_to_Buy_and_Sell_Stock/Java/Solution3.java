package Problem_121__Best_Time_to_Buy_and_Sell_Stock.Java;

public class Solution3 {
    public int maxProfit(int[] prices) {

        // 初始化兩個指標：left 代表買入時間，right 代表賣出時間
        int left = 0, right = 1;
        int max_profit = 0;

        // 一一移動賣出時間，計算最大獲利
        while (right < prices.length) {

            // 如果買入價小於賣出價：代表有獲利，則計算利潤，並更新最大利潤
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                max_profit = Math.max(max_profit, profit);
            }
            // 如果買入價格大於賣出價格：代表更便宜買入價出現，更新買入時間
            else {
                left = right;
            }

            // 繼續嘗試下一個賣出時間
            right++;
        }

        return max_profit;
    }
}
