package Problem_746__Min_Cost_Climbing_Stairs.Java;

import java.util.Arrays;

public class Solution_B {
    // memo陣列用來儲存每個階段的最小成本
    private int[] memo;
    
    // 主函數，計算最小爬樓梯的成本
    public int minCostClimbingStairs(int[] cost) {
        // 初始化memo陣列，每個位置預設為-1，表示尚未計算過
        memo = new int[cost.length];
        Arrays.fill(memo, -1);

        // 從第0階或第1階走到最後所需成本的最小值
        return Math.min(dfs(0, cost), dfs(1, cost));
    }

    // 計算從第 i 階到最後的最小成本
    private int dfs(int i, int[] cost) {
        // 如果超過最後一階，表示到達終點，返回 0
        if (i >= cost.length) {
            return 0;
        }

        // 如果memo[i]不為-1，表示已經計算過，直接返回計算結果
        if (memo[i] != -1) {
            return memo[i];
        }

        // 這階的成本 + 下一階到最後以及下兩階到最後的成本的最小值
        // 同時儲存結果以利未來使用
        memo[i] = cost[i] + Math.min(dfs(i + 1, cost), dfs(i + 2, cost));

        return memo[i];
    }
}
