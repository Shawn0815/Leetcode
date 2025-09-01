package Problem_121__Best_Time_to_Buy_and_Sell_Stock.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    // Solution1 solution = new Solution1();
    Solution2 solution = new Solution2();
    // Solution3 solution = new Solution3();

    @Test
    public void maxProfitTest_01() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int output = 5;

        assertEquals(output, solution.maxProfit(prices));
    }

    @Test
    public void maxProfitTest_02() {
        int[] prices = { 7, 6, 4, 3, 1 };
        int output = 0;

        assertEquals(output, solution.maxProfit(prices));
    }
}
