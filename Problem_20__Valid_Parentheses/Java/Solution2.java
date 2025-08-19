package Problem_20__Valid_Parentheses.Java;

import java.util.Stack;

public class Solution2 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // 依序loop string 中的每個字元
        for (char c: s.toCharArray()) {
            // 如果是開括號，放入stack中
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // 如果是閉括號，檢查stack的頂部看是否有對應的開括號
            else {
                // 前面沒有開括號，return false（否則直接pop會出事）
                if (stack.isEmpty()) {
                    return false;
                }

                // 拿出stack的頂部元素
                char top = stack.pop();

                // 如果跟當前字元不成對，return false
                if ((c == ')' && top !='(') || 
                    (c == ']' && top !='[') || 
                    (c == '}' && top !='{')) {
                    return false;
                }
            }
        }

        // 全部檢查完，stack是空的（所有開括號都被消除），return true
        return stack.isEmpty();
    }
}
