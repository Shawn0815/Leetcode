package Problem_121__Best_Time_to_Buy_and_Sell_Stock.Java;

public class TestDemo {
    public static void main(String[] args) {
        int[] prices1 = new int[]{7,1,5,3,6,4};
        int[] prices2 = new int[]{7,6,4,3,1};

        System.out.println("Prices1's profit is: " + Solution1.maxProfit(prices1));
        System.out.println("Prices2's profit is: " + Solution1.maxProfit(prices2));
    }
}

