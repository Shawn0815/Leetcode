package Problem_309__Best_Time_to_Buy_and_Sell_Stock_with_Cooldown.Java;

public class Solution {

    public int maxProfit(int[] prices) {

        int n = prices.length;

        int hold = -prices[0];
        int sold = 0;
        int rest = 0;
        
        for (int i = 1; i < n; i++) {

            int prevHold = hold;
            int prevSold = sold;
            int prevRest = rest;

            hold = Math.max(prevRest - prices[i], prevHold);
            sold = prevHold + prices[i];
            rest = Math.max(prevRest, prevSold);
        }

        return Math.max(sold, rest);
    }
}
