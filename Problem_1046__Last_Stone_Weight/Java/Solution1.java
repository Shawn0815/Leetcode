package Problem_1046__Last_Stone_Weight.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {
    public static int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();

        // 將陣列轉成 List
        for (int stone: stones) {
            list.add(stone);
        }

        // 每次找出最大的兩顆石頭來撞擊
        while (list.size() > 1) {
            
            Collections.sort(list);
            
            int largest_1 = list.remove(list.size() - 1); // 最重的
            int largest_2 = list.remove(list.size() - 1); // 第二重的

            // 如果重量不同，將差值加入 List
            if (largest_1 != largest_2) {
                list.add(largest_1 - largest_2);
            }
        }

        // 如果list是空的，回傳0
        if (list.isEmpty()) {
            return 0;
        }

        // 取得list剩下的唯一元素
        return list.get(0);
    }
}
