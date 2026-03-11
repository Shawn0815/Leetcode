package Problem_50__Pow_x_n.Java;

public class Solution1 {
    
    public double myPow(double x, int n) {

        // 底數為 0，答案一定是 0
        if (x == 0) {
            return 0;
        }

        // 次方為 0，答案一定是 1
        if (n == 0) {
            return 1;
        }

        double result = 1;
        int p = Math.abs(n);

        // 幾次方就乘幾次
        for (int i = 0; i < p; i++) {
            result *= x;
        }

        // 負數次方結果要取倒數
        return (n > 0) ? result : 1/result;
    }
}
