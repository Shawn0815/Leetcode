package Problem_746__Min_Cost_Climbing_Stairs.Java;

public class Solution_A {
    // 主函數，計算最小爬樓梯的成本
    public int minCostClimbingStairs(int[] cost) {
        // 從第0階或第1階走到最後所需成本的最小值
        return Math.min(dfs(0, cost), dfs(1, cost));
    }

    // 計算從第 i 階到最後的最小成本
    private int dfs(int i, int[] cost) {
        // 如果超過最後一階，表示到達終點，返回 0
        if (i >= cost.length) {
            return 0;
        }

        // 這階的成本 + 下一階到最後以及下兩階到最後的成本的最小值
        return cost[i] + Math.min(dfs(i + 1, cost), dfs(i + 2, cost));
    }
}
