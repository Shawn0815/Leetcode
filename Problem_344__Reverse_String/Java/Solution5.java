package Problem_344__Reverse_String.Java;

import java.util.Stack;

public class Solution5 {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        
        // 將 s 中所有字元依序 push 進 Stack 中
        for (char c: s) {
            stack.push(c);
        }

        int i = 0;

        // 從 stack 頂部一個個 pop 出元素賦值回 s[i]
        // 取出的元素順序即為反轉後的結果
        while (!stack.isEmpty()) {
            s[i] = stack.pop();
            i++;
        }
    }
}
