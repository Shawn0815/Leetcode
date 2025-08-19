package Problem_190__Reverse_Bits.Java;

public class Solution1 {
    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // 取得 n 的第 i 個 bit
            int bit = (n >> i) & 1;
            // 利用OR加到反轉位置上
            result |= (bit << (31 - i));
        }

        return result;
    }
}

