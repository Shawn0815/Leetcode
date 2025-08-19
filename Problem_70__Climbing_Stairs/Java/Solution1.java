package Problem_70__Climbing_Stairs.Java;

public class Solution1 {
    public int climbStairs(int n) {
        // Base case：如果剩 1 或 2 階，直接回傳對應的走法數
        if (n <= 2) {
            return n;
        }

        // 走到第 n 階的方法數 = 走到 n-1 階的方法數 + 走到 n-2 階的方法數
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
