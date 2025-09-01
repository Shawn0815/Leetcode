package Problem_20__Valid_Parentheses.Java;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            // 若為開括號，放入stack中
            if (c == '(' || c ==  '[' || c ==  '{') {
                stack.push(c);
            }
            // 若為閉括號，檢查stack的頂部元素是否對應括號
            else {
                // stack是空的
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // stack頂部元素非對應括號
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
