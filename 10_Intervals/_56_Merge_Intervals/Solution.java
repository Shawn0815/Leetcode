package _56_Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> resultList = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int[] interval: intervals) {
            if (resultList.isEmpty()) {
                resultList.add(interval);
                continue;
            }

            int[] lastInterval = resultList.getLast();

            if (interval[0] <= lastInterval[1]) {
                lastInterval[1] = interval[1];
            }
            else {
                resultList.add(interval);
            }
        }

        return resultList.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1, 3}, {1, 5}, {6, 7}};

        Solution sol = new Solution();
        int[][] output = sol.merge(intervals);

        System.out.println(Arrays.deepToString(output));
    }
}
