package Problem_191__Number_of_1_Bits.Java;

public class Solution2 {
    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            // 用 bit 操作：n & (n - 1) 可以將 n 最右邊的 1 消掉
            n = n & (n - 1);
            count += 1;
        }

        return count;
    }
}
