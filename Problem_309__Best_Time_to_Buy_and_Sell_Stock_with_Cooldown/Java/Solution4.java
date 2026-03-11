package Problem_309__Best_Time_to_Buy_and_Sell_Stock_with_Cooldown.Java;

public class Solution4 {

    public int maxProfit(int[] prices) {

        int n = prices.length;

        // 三種狀態
        int[] hold = new int[n]; // 今天結束時手上有股票
        int[] sold = new int[n]; // 今天結束時剛賣出股票
        int[] rest = new int[n]; // 今天結束時手上無股票（非剛賣出）

        // 第一天的初始狀態
        hold[0] = -prices[0]; // 第一天唯一能做的事是買
        sold[0] = 0;          // 不可能第一天就賣
        rest[0] = 0;          // 完全不動也不會有獲利
        
        for (int i = 1; i < n; i++) {
            
            // 今天結束持股：昨天持股 or 昨天空手今天買
            hold[i] = Math.max(rest[i - 1] - prices[i], hold[i - 1]);

            // 今天結束為剛賣出：昨天持股，今天賣
            sold[i] = hold[i - 1] + prices[i];

            // 今天結束空手：昨天空手 or 昨天剛賣
            rest[i] = Math.max(rest[i - 1], sold[i - 1]);
        }

        // 最後一天不能持股：從已賣或空手中選最大
        return Math.max(sold[n - 1], rest[n - 1]);
    }
}
