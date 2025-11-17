package Problem_739__Daily_Temperatures.Java;

public class Solution1 {

    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] answers = new int[temperatures.length];

        // 雙層迴圈：針對每天找尋第一個比天溫度高的天數
        for (int i = 0; i < temperatures.length - 1; i++) {

            int day = 0;
            
            for (int j = i + 1; j < temperatures.length; j++) {

                day++;

                // 找到了，設定 answers 陣列
                if (temperatures[j] > temperatures[i]) {
                    answers[i] = day;
                    break;
                }
            }
        }

        return answers;
    }
}
