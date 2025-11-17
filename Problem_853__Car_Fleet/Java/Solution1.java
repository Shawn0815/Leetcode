package Problem_853__Car_Fleet.Java;

import java.util.Arrays;
import java.util.Stack;

public class Solution1 {
    
    public int carFleet(int target, int[] position, int[] speed) {
        
        // 建立 (position, speed) 二維陣列
        int[][] pairs = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        // 對陣列的第一個元素 position 做排序
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        // 建立 Stack 存放車隊
        Stack<Double> stack = new Stack<>();

        for (int[] pair: pairs) {

            // 計算每台車抵達終點所需的時間
            double time = (double) (target - pair[0]) / pair[1];
            
            // 先假設他是一個新的車隊
            stack.push(time);

            // 若 時間 < 前車時間，代表會追上，合併成一個車隊，將它從 Stack 中移除
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }

        // Stack 大小即為車隊數量
        return stack.size();
    }
}
