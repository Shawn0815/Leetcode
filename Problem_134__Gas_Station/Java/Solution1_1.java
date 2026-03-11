package Problem_134__Gas_Station.Java;

public class Solution1_1 {
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;

        for (int start = 0; start < n; start++) {
            
            int tank = gas[start] - cost[start];

            if (tank < 0) {
                continue;
            }

            int pos = (start + 1) % n;

            while (pos != start) {

                tank += gas[pos] - cost[pos];

                if (tank < 0) {
                    break;
                }

                pos = (pos + 1) % n;
            }

            if (pos == start) {
                return start;
            }
        }

        return -1;
    }
}
