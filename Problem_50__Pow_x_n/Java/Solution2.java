package Problem_50__Pow_x_n.Java;

public class Solution2 {
    
    public double myPow(double x, int n) {

        // 底數為 0，答案一定是 0
        if (x == 0) {
            return 0;
        }

        // 次方為 0，答案一定是 1
        if (n == 0) {
            return 1;
        }
        
        // 呼叫子函數第迴縮小次方規模
        double result = helper(x, Math.abs((long) n));

        // 若次方為負數，需要取倒數
        return n > 0 ? result : 1/result;
    }

    private double helper(double x, long n) {

        // 如果拆到最後次方為 1，直接回傳 x 本身
        if (n == 1) {
            return x;
        }

        // 利用 x ^ (n/2) 來推得 x ^ n
        double half = helper(x, n/2);

        // 偶數：x ^ n = x ^ (n/2) * x ^ (n/2)
        // 奇數：x ^ n = x ^ (n/2) * x ^ (n/2) * x
        return (n % 2 == 0) ? half * half : half * half * x;
    }
}
