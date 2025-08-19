package Problem_191__Number_of_1_Bits.Java;

public class Solution1 {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // (n & 1) 會取出 n 的最右邊一位（最低位元）
            // 如果這一位是 1，就代表目前位元是 1
            if ((n & 1) == 1) {
                count += 1;
            }

            // 將 n 右移一位，相當於把最低位拿掉、往右一格
            n >>= 1;
        }

        return count;
    }
}