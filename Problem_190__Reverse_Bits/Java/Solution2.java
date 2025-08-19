package Problem_190__Reverse_Bits.Java;

public class Solution2 {
    public static int reverseBits(int n) {
        int ret = n;

        // step1: 交換前半與後半
        ret = (ret >>> 16) | (ret << 16); 

        // step2: 交換前一個byte與後一個byte
        ret = ((ret & 0xFF00FF00) >>> 8) | ((ret & 0x00FF00FF) << 8);

        // step3: 交換每個byte裡面前四個bit與後四個bit
        ret = ((ret & 0xF0F0F0F0) >>> 4) | ((ret & 0x0F0F0F0F) << 4);

        // step4: 交換每四個bit裡面前兩個bit與後兩個bit (mask: 1100, 0011)
        ret = ((ret & 0xCCCCCCCC) >>> 2) | ((ret & 0x33333333) << 2);

        // step4: 交換每兩個bit裡面前面的bit與後面的bit (mask: 1010, 0101)
        ret = ((ret & 0xAAAAAAAA) >>> 1) | ((ret & 0x55555555) << 1);

        return ret;
    }
}
