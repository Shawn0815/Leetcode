package Problem_344__Reverse_String.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1_1 {
    public void reverseString(char[] s) {
        List<Character> list = new ArrayList<>();

        // 將 String 中每個字元加入 List 中
        for (char c: s) {
            list.add(c);
        }

        // 用 Collections.reverse 對 list 做反轉
        Collections.reverse(list);

        // Loop List 中每個字元賦值回 charArray s
        for (int i = 0; i < s.length; i++) {
            s[i] = list.get(i);
        }
    }
}
