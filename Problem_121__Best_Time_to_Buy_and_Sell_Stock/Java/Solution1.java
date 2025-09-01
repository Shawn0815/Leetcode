package Problem_121__Best_Time_to_Buy_and_Sell_Stock.Java;

public class Solution1 {
    public int maxProfit(int[] prices) {
        int max_profit = 0;

        // 嘗試每一個可能的買入日
        for (int i = 0; i < prices.length - 1; i++) {

            // 嘗試每一個可能的賣出日（必須晚於買入日）
            for (int j = i + 1; j < prices.length; j++) {

                // 更新目前最大利潤
                max_profit = Math.max(max_profit, prices[j] - prices[i]);
            }
        }

        return max_profit;
    }
}
