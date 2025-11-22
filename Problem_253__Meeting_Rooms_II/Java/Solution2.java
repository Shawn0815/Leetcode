package Problem_253__Meeting_Rooms_II.Java;

import java.util.Arrays;

public class Solution2 {
    
    public int minMeetingRooms(int[][] intervals) {
        
        int n = intervals.length;

        // 建立起始時間與結束時間陣列
        int[] start = new int[n];
        int[] end = new int[n];

        // 依序將每個區間的起始時間與結束時間放入陣列中
        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        // 分別排序兩個陣列
        Arrays.sort(start);
        Arrays.sort(end);

        // i：起始時間陣列 pointer
        // j：結束時間陣列 pointer
        int i = 0, j = 0;
        int count = 0;
        int maxCount = 0;

        // 依序比較起始時間與結束時間，直到所有起始時間比完
        while (i < n) {

            // 起始 > 結束：新會議開始，count++
            if (start[i] < end[j]) {
                count++;
                i++;
            }
            // 起始 <= 結束：前一個會議結束，count--
            else {
                count--;
                j++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
