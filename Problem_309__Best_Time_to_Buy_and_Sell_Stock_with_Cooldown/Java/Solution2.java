package Problem_309__Best_Time_to_Buy_and_Sell_Stock_with_Cooldown.Java;

public class Solution2 {

    private Integer[][] dp;

    public int maxProfit(int[] prices) {
        
        dp = new Integer[prices.length][2]; // [0]：無持股、[1]：有持股
        return dfs(prices, 0, 0);
    }

    private int dfs(int[] prices, int i, int hold) {

        if (i >= prices.length) {
            return 0;
        }

        // 若計算過直接回傳答案
        if (dp[i][hold] != null) {
            return dp[i][hold];
        }

        int cooldown = dfs(prices, i + 1, hold);
        int maxProfit = 0;

        // 有持股：可賣出（兩天後）
        if (hold == 1) {
            int sell = dfs(prices, i + 2, 0) + prices[i];
            maxProfit = Math.max(sell, cooldown);
            
        }
        // 無持股：可買入
        else {
            int buy = dfs(prices, i + 1, 1) - prices[i];
            maxProfit = Math.max(buy, cooldown);
        }

        // 儲存答案至 dp 陣列
        dp[i][hold] = maxProfit;
        return maxProfit;
    }
}
