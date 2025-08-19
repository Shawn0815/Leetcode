package Problem_746__Min_Cost_Climbing_Stairs.Java;

public class Solution_C {
    // 用來儲存每階的最小爬樓梯成本
    private int[] memo;

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        // 只有一階，返回此階成本
        if (n == 1) {
            return cost[0];
        }
        
        // 只有兩階，返回兩階成本最小值
        if (n == 2) {
            return Math.min(cost[0], cost[1]);
        }

        // 初始化 memo 陣列，大小為 n
        memo = new int[n];

        // Base case：最後一階及最後兩階的最小成本即為該階成本
        memo[n - 1] = cost[n - 1];
        memo[n - 2] = cost[n - 2];

        // 倒數第三階開始，成本為該階成本 + 後兩階成本最小值
        for (int i = n - 3; i >= 0; i--) {
            memo[i] = cost[i] + Math.min(memo[i + 1], memo[i + 2]);
        }

        // 最後返回從第0階或第1階出發成本最小值
        return Math.min(memo[0], memo[1]);
    }
}
