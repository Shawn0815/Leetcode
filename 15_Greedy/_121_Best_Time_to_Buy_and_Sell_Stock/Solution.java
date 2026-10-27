package _121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price: prices) {
            if (price < minPrice) {
                minPrice = price;
                continue;
            }

            int profit = price - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {10, 1, 5, 6, 7, 1};

        Solution sol = new Solution();
        int output = sol.maxProfit(prices);

        System.out.println(output);
    }
}
