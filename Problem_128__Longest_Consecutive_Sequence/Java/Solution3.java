package Problem_128__Longest_Consecutive_Sequence.Java;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {

    public int longestConsecutive(int[] nums) {

        // 如果 nums 為空陣列，直接回傳 0
        if (nums.length == 0) {
            return 0;
        }

        // 用一個 set 紀錄所有數字
        Set<Integer> set = new HashSet<>();
        
        for (int num: nums) {
            set.add(num);
        }

        // 初始化 maxCount
        int maxCount = 0;
        
        // 遍歷每個數字，計算由他開始的連續數字個數
        for (int num: set) {

            // 只有他是連續數字的最小數字才去計算 count
            if (!set.contains(num - 1)) {

                // 初始化 count
                int count = 1;
                
                // 如果陣列中有 (num+1) 這個數，count++，並重複檢查
                while (set.contains(num + 1)) {
                    count++;
                    num++; // 更新 num 為 num+1
                }

                // 如果連續數字斷掉，更新 maxCount
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
