package Problem_70__Climbing_Stairs.Java;

public class Solution4 {
    public int climbStairs(int n) {
        // 若只有 1 或 2 階，直接return n
        if (n <= 2) {
            return n;
        }

        // cur = prev + prev_prev（目前 = 前一階 + 前兩階）
        // 從第三階開始，初始化 prev = 2, prev_prev = 1
        int prev = 2, prev_prev = 1;
        int cur = 0;

        // 計算cur，並更新prev, prev_prev
        for (int i = 3; i <= n; i++) {
            cur = prev + prev_prev;
            prev_prev = prev;
            prev = cur;
        }

        return cur;
    }
}
