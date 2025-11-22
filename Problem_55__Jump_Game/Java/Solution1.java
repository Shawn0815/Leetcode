package Problem_55__Jump_Game.Java;

public class Solution1 {
    
    public boolean canJump(int[] nums) {

        return dfs(nums, 0);
    }

    private boolean dfs(int[] nums, int i) {

        int n = nums.length;

        // 如果能夠走到底，代表成功
        if (i == n - 1) {
            return true;
        }

        // 以目前 i 為起點，最遠能走到的位置
        int end = Math.min(i + nums[i], n - 1);

        // 嘗試所有可能抵達的位置
        for (int j = i + 1; j <= end; j++) {

            // 遞迴檢查下個位置是否能成功，其中一個成功，就回傳 true
            if (dfs(nums, j)) {
                return true;
            }
        }

        // 所有選擇皆不成功，回傳 false
        return false;
    }
}
