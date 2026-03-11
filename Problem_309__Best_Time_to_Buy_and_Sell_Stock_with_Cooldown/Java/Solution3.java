package Problem_309__Best_Time_to_Buy_and_Sell_Stock_with_Cooldown.Java;

public class Solution3 {

    public int maxProfit(int[] prices) {
        
        int[][] dp = new int[prices.length + 2][2]; // [0]：未持股、[1]：持股

        for (int i = prices.length - 1; i >= 0; i--) {
            
            // 未持股：可買入或不進行動作
            int cooldown1 = dp[i + 1][0];
            int buy = dp[i + 1][1] - prices[i];
            dp[i][0] = Math.max(buy, cooldown1);

            // 有持股：可賣出（兩天後）或不進行動作
            int cooldown2 = dp[i + 1][1];
            int sell = dp[i + 2][0] + prices[i];
            dp[i][1] = Math.max(sell, cooldown2);
        }

        return dp[0][0];
    }
}
