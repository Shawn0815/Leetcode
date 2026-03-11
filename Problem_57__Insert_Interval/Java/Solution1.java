package Problem_57__Insert_Interval.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> result = new ArrayList<>();

        for (int[] interval: intervals) {
            
            // 如果新區間已經插入完畢，舊區間直接插入即可
            if (newInterval == null) {
                result.add(interval);
                continue;
            }

            // 如果新區間完整在舊區間前，插入新區間
            if (newInterval[1] < interval[0]) {
                result.add(newInterval);
                result.add(interval);
                newInterval = null; // 代表插入完畢
            }
            // 如果新區間完整在舊區間後，插入舊區間
            else if (newInterval[0] > interval[1]) {
                result.add(interval);
            }
            // 剩餘情況：新舊區間有重疊
            // 更新新區間起始時間為兩區間的起始時間最小值
            // 更新新區間結束時間為兩區間的結束時間最大值
            else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }

        // 將結果 List 轉換為 Array
        return result.toArray(new int[0][]);
    }
}
