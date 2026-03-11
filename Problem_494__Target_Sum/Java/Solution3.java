package Problem_494__Target_Sum.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    
    public int findTargetSumWays(int[] nums, int target) {
        
        int n = nums.length;

        // dp[i] 為一個 HashMap，代表前 i 個數字可湊出的總合即對應方法
        // dp[i].key = 總和；dp[i].value = 方法數
        Map<Integer, Integer>[] dp = new HashMap[n + 1];

        // 初始化 dp 每個元素為空的 HashMap
        for (int i = 0; i <= n; i++) {
            dp[i] = new HashMap<>();
        }

        // Base case：0 個數字湊出總和為 0，方法一種
        dp[0].put(0, 1);

        // 一層一層計算填入所有可能的總合對應的方法
        for (int i = 1; i <= n; i++) {
            
            // 針對上一層的每一個總合拿出來計算下一層
            for (Map.Entry<Integer, Integer> entry: dp[i - 1].entrySet()) {

                int prevSum = entry.getKey();    // 總和
                int prevWays = entry.getValue(); // 方法數

                // 選擇加號：總和為 prevSum + nums[i - 1]
                dp[i].put(prevSum + nums[i - 1], dp[i].getOrDefault(prevSum + nums[i - 1], 0) + prevWays);

                // 選擇減號：總和為 prevSum - nums[i - 1]
                dp[i].put(prevSum - nums[i - 1], dp[i].getOrDefault(prevSum - nums[i - 1], 0) + prevWays);
            }
        }

        // 最終答案：用前 n 個數字組出 target
        return dp[n].getOrDefault(target, 0);
    }
}
