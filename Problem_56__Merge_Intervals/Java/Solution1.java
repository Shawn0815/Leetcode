package Problem_56__Merge_Intervals.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    
    public int[][] merge(int[][] intervals) {
        
        // 針對區間的起始時間作排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // 先加入第一個區間至結果 List
        result.add(new int[] {intervals[0][0], intervals[0][1]});

        // Loop 剩下的區間判斷要加入 List 或 修改 List
        for (int i = 1; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];
            int prevEnd = intervals[i - 1][1];

            // 如果當前區間起始時間 <= 前一個區間終止時間，代表兩個區間可以合併
            // 把 List 中最後一個區間的終止時間改為兩個區間終止時間的最大值
            if (start <= prevEnd) {
                result.getLast()[1] = Math.max(end, prevEnd);
            }
            // 否則將區間新增至 List
            else {
                result.add(new int[] {start, end});
            }
        }

        // 轉換 List 為 Array 寫法
        return result.toArray(new int[0][]);
    }
}
