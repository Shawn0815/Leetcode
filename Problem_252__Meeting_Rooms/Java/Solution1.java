package Problem_252__Meeting_Rooms.Java;

import java.util.List;

public class Solution1 {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // 遍歷所有區間 A
        for (int i = 0; i < intervals.size(); i++) {
            Interval A = intervals.get(i);

            // 與其後的每一個區間 B 比較
            for (int j = i + 1; j < intervals.size(); j++) {
                Interval B = intervals.get(j);
                
                // 檢查區間 A 和 B 是否重疊
                if (A.start < B.end && B.start < A.end) {
                    return false;
                }
            }
        }

        return true;
    }
}
