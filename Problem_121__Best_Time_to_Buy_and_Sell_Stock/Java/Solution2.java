package Problem_121__Best_Time_to_Buy_and_Sell_Stock.Java;

public class Solution2 {
    public static int maxProfit(int[] prices) {
        // 初始最小價格設定為第一天的價格，初始最大利潤為 0
        int min_price = prices[0];
        int max_profit = 0;

        // 遍歷所有價格
        for (int i = 0; i < prices.length; i++) {
            // 更新目前為止的最低買入價格
            min_price = Math.min(min_price, prices[i]);
            
            // 計算若今天賣出能賺多少，同時更新最大獲利
            int profit = prices[i] - min_price;
            max_profit = Math.max(max_profit, profit);
        }

        return max_profit;
    }
}
