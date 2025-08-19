package Problem_202__Happy_Number.Java;

public class Solution2 {
    public static boolean isHappy(int n) {
        int slow = n, fast = sumOfSquares(n); // 避免一開始slow就 = fast

        while (fast != 1 && slow != fast) {
            // 快指標一次一步，慢指標一次兩步
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
            
            if (fast == 1) {
                return true;
            }
        }

        // 如果快指標先碰到 1，回傳true
        return fast == 1;
    }

    // 計算一個數的每位數平方總和
    public static int sumOfSquares(int x) {
        int sum = 0;

        while (x != 0) {
            sum += Math.pow((x % 10), 2);
            x /= 10;
        }

        return sum;
    }
}
