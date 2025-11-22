package Problem_57__Insert_Interval.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        // 把新區間左邊所有區間加入 List
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // 把重疊的區間合併起來，最後一次加入 List
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        result.add(newInterval);

        // 把新區間右邊所有區間加入 List（剩下的區間）
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[0][]);
    }
}
