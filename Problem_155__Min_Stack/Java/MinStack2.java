package Problem_155__Min_Stack.Java;

import java.util.Stack;

public class MinStack2 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack; // minStack 記錄所有歷史最小值

    public MinStack2() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        // 若 minStack 空的 或 出現更小（等於）的元素，推入 minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        int pop = stack.pop();

        // 若取出元素為目前最小值，從 minStack 移除
        // minStack 的頂部會剩目前第二小的值（曾經最小值）
        if (pop == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
