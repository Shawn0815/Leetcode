package Problem_309__Best_Time_to_Buy_and_Sell_Stock_with_Cooldown.Java;

public class Solution1 {
    
    public int maxProfit(int[] prices) {
        
        // 從第 0 天開始，初始狀態手上無持股
        return dfs(prices, 0, false);
    }

    // 從第 i 天開始的最大獲利（hold 代表目前是否持股）
    private int dfs(int[] prices, int i, boolean hold) {

        // 如果起始日超過範圍，代表無獲利
        if (i >= prices.length) {
            return 0;
        }

        // 1. 每天必有的選擇：不進行動作
        // => 最大獲利 = 明天的最大獲利
        int cooldown = dfs(prices, i + 1, hold);
        int maxProfit = 0;

        // 2. 手上有持股，今天可賣，計算最大獲利
        // => 最大獲利 = 兩天後最大獲利 + 今日賣出價格
        if (hold) {
            int sell = dfs(prices, i + 2, false) + prices[i];
            maxProfit = Math.max(sell, cooldown);
            
        }
        // 3. 手上沒持股，今天可買，計算最大獲利
        // => 最大獲利 = 明天最大獲利 - 今日買入價格
        else {
            int buy = dfs(prices, i + 1, true) - prices[i];
            maxProfit = Math.max(buy, cooldown);
        }

        return maxProfit;
    }
}
