public class Solution {
    public int[][] Merge(int[][] intervals) {
        List<int[]> resultList = new List<int[]>();

        Array.Sort(intervals, (a, b) => a[0].CompareTo(b[0]));

        foreach (int[] interval in intervals) {
            if (resultList.Count == 0)
            {
                resultList.Add(interval);
                continue;
            }

            int[] lastInterval = resultList[resultList.Count - 1];

            if (interval[0] <= lastInterval[1])
            {
                lastInterval[1] = interval[1];
            }
            else
            {
                resultList.Add(interval);
            }
        }

        return resultList.ToArray();
    }
}
