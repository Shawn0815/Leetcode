public class Solution {
    public int MaxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        foreach (int price in prices)
        {
            if (price < minPrice)
            {
                minPrice = price;
                continue;
            }

            int profit = price - minPrice;
            maxProfit = Math.Max(maxProfit, profit);
        }

        return maxProfit;
    }

    public static void Main(string[] args) {
        int[] prices = new int[] {10, 1, 5, 6, 7, 1};

        Solution sol = new Solution();
        int output = sol.MaxProfit(prices);

        Console.WriteLine(output);
    }
}