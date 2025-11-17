package Problem_739__Daily_Temperatures.Java;

import java.util.Stack;

public class Solution2 {
    
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] answers = new int[temperatures.length];

        // 建立一個 Stack 存放「還沒找到更熱天數」的「索引」
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            // 只要 Stack 中有某一天溫度比當前溫度低，代表那天找到更高溫度了
            // 將元素 pop 出來，並計算兩天之間的差 = 經過幾天，放入 answer 陣列
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();
                int day = i - index;

                answers[index] = day;
            }

            // 將當前天數的索引放入 Stack 中
            stack.push(i);
        }

        return answers;
    }
}
