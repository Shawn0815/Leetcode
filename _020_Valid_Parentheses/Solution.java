package _020_Valid_Parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (!stack.isEmpty()) {
                    char top = stack.pop();

                    if ((top == '(' && c != ')') ||
                        (top == '[' && c != ']') ||
                        (top == '{' && c != '}')) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[(])";

        Solution sol = new Solution();
        boolean output = sol.isValid(s);

        System.out.println(output);
    }
}
