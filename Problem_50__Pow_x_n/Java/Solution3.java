package Problem_50__Pow_x_n.Java;

public class Solution3 {
    
    public double myPow(double x, int n) {

        double result = 1;

        // 底數為 0，答案一定是 0
        if (x == 0) {
            return 0;
        }

        // 次方為 0，答案一定是 1
        if (n == 0) {
            return 1;
        }

        // 次方先取絕對值
        long power = Math.abs((long) n);

        // 只要次方不為零就繼續，最後次方會變為 1
        while (power > 0) {

            // 如果是奇數，要把多出來的 x 乘進結果中保存
            if (power % 2 == 1) {
                result *= x;
            }

            // x 變為 x^2，次方變一半
            x = x * x;
            power = power / 2;
        }

        // 若次方是負數，記得取倒數
        return (n > 0) ? result : 1/result;
    }
}
