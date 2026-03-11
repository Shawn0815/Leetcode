package Problem_20__Valid_Parentheses.Java;

import java.util.Stack;

public class Solution {
    
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            Character symbol = s.charAt(i);

            if (symbol == '(' || symbol == '[' || symbol == '{') {

                stack.push(symbol);
            }
            else {

                if (stack.isEmpty()) {
                    return false;
                }
                
                Character top = stack.pop();

                if ((symbol == ')' && top != '(') || 
                    (symbol == ']' && top != '[') || 
                    (symbol == '}' && top != '{')) {
                        
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
