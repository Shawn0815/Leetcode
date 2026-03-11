package Problem_45__Jump_Game_II.Java;

public class Solution1 {
    
    public int jump(int[] nums) {
        
        return dfs(nums, 0);
    }

    // 針對每個起點 i，計算最小步數
    private int dfs(int[] nums, int i) {

        int n = nums.length;

        // 抵達終點，步數為 0
        if (i == n - 1) {
            return 0;
        }

        // 初始化最小步數為夠大的值
        int minJump = 10000; 

        // 計算這個起點最遠的能跳到的位置
        int end = Math.min(i + nums[i], n - 1);

        // 嘗試所有跳法，遞迴並總結出每個選擇的最小步數
        for (int j = i + 1; j <= end; j++) {
            minJump = Math.min(minJump, dfs(nums, j) + 1);
        }

        return minJump;
    }
}
