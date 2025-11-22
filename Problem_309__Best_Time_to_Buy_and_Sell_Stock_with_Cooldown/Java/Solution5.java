package Problem_309__Best_Time_to_Buy_and_Sell_Stock_with_Cooldown.Java;

public class Solution5 {

    public int maxProfit(int[] prices) {

        int n = prices.length;

        int hold = -prices[0];
        int sold = 0;
        int rest = 0;
        
        for (int i = 1; i < n; i++) {

            // 保存前一天三個狀態
            int prevHold = hold;
            int prevSold = sold;
            int prevRest = rest;

            // 今天結束持股：昨天持股 or 昨天空手今天買
            hold = Math.max(prevRest - prices[i], prevHold);

            // 今天結束剛賣出：昨天持股，今天賣
            sold = prevHold + prices[i];

            // 今天結束空手：昨天空手 or 昨天剛賣
            rest = Math.max(prevRest, prevSold);
        }

        return Math.max(sold, rest);
    }
}
