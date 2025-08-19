package Problem_121__Best_Time_to_Buy_and_Sell_Stock.Java;

public class Solution3 {
    public static int maxProfit(int[] prices) {
        // 初始化兩個指標，left 代表買入時間，right 代表賣出時間
        int left = 0, right = 1;
        int max_profit = 0;

        // 嘗試所有賣出時間，找尋最大獲利
        while (right < prices.length) {
            // 如果買入價格小於賣出價格，則計算利潤
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                max_profit = Math.max(max_profit, profit); // 更新最大利潤
            }
            // 如果買入價格大於賣出價格，更新買入價格為目前最低價
            else {
                left = right;
            }

            // 繼續嘗試下一個賣出時間
            right++;
        }

        return max_profit;
    }
}
