package Problem_338__Counting_Bits.Java;

public class Solution1 {
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];

        // 對每個數字 i 計算有幾個 1
        for (int i = 0; i <= n; i++) {
            int num = i;
            
            // 位元操作：每次將 num 最右邊的 1 消掉
            while (num != 0) {
                num &= (num - 1);
                result[i] += 1;
            }
        }

        return result;
    }
}
