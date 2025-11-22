package Problem_309__Best_Time_to_Buy_and_Sell_Stock_with_Cooldown.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void maxProfitTest_01() {

        int[] prices = new int[] {1, 2, 3, 0, 2};

        int output = solution.maxProfit(prices);
        int expected = 3;

        assertEquals(expected, output);
    }

    @Test
    public void maxProfitTest_02() {

        int[] prices = new int[] {1};

        int output = solution.maxProfit(prices);
        int expected = 0;

        assertEquals(expected, output);
    }
}
