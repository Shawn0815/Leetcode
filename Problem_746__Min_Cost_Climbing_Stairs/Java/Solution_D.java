package Problem_746__Min_Cost_Climbing_Stairs.Java;

public class Solution_D {
    public int minCostClimbingStairs(int[] cost) {
        // 從倒數第三階開始，更新走到最後的最小成本（該階成本 + 後兩階成本最小值）
        // 不須初始化base case，因為後兩階成本即為cost
        for (int i = cost.length - 3; i >= 0; i--) {
            cost[i] = cost[i] + Math.min(cost[i + 1], cost[i + 2]);
        }

        // 從第一階或第二階出發到最後的最小成本
        return Math.min(cost[0], cost[1]);
    }
}
