package Problem_739__Daily_Temperatures.Java;

public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        
        int length = temperatures.length;
        int[] answers = new int[length];
        
        for (int i = temperatures.length - 2; i >= 0; i--) {

            int j = i + 1;

            while (j < length && temperatures[j] <= temperatures[i]) {

                if (answers[j] == 0) {
                    j = length;
                    break;
                }
                
                j += answers[j];
            }

            if (j < length) {
                answers[i] = j - i;
            }
        }

        return answers;
    }
}
