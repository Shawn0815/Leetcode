package Problem_739__Daily_Temperatures.Java;

public class Solution3 {

    public int[] dailyTemperatures(int[] temperatures) {
        
        int length = temperatures.length;
        int[] answers = new int[length];
        
        // 從倒數第二天開始找（最後一天沒有更熱的天）
        for (int i = temperatures.length - 2; i >= 0; i--) {

            // 預設更熱的天數是右邊那天
            int j = i + 1;

            // 如果右邊那天沒有更熱，就往後跳
            while (j < length && temperatures[j] <= temperatures[i]) {

                // 如果右邊那天本身就沒有更熱的天，結束搜尋
                // 將天數設為總長度，來表示沒找到
                if (answers[j] == 0) {
                    j = length;
                    break;
                }
                
                // 如果知道右邊那天要等多少天會遇到更熱的天
                // 直接跳過中間這幾天到那天，在重複檢查是否真的比當前溫度更熱
                j += answers[j];
            }

            // 最後答案 = 更熱的天數 - 當前天數
            if (j < length) {
                answers[i] = j - i;
            }
        }

        return answers;
    }
}
