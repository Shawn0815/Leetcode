package Problem_252__Meeting_Rooms.Java;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution2 {
    public boolean canAttendMeetings(List<Interval> intervals) {
        
        // 將會議依照「開始時間」排序（升序）
        Collections.sort(intervals, Comparator.comparingInt((Interval i) -> i.start));

        // 檢查相鄰兩個會議是否有重疊
        for (int i = 0; i < intervals.size() - 1; i++) {
            Interval A = intervals.get(i);
            Interval B = intervals.get(i + 1);

            // 如果前一個會議的結束時間比下一個會議的開始時間還晚，代表重疊
            if (A.end > B.start) {
                return false;
            }
        }

        return true;
    }
}
