package Problem_155__Min_Stack.Java;

import java.util.Stack;

public class MinStack1 {
    
    private Stack<Integer> stack;

    public MinStack1() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        // 建立暫存元素的 stack
        Stack<Integer> tempStack = new Stack<>();

        // 初始化 min
        int min = stack.peek();

        // 一個個將 satck 元素取出，檢查是否為 min
        // 檢查完存放在暫存 stack
        while (!stack.empty()) {
            int top = stack.pop();
            min = Math.min(min, top);
            
            tempStack.push(top);
        }

        // 最後將暫存 stack 再搬回原始 stack 中
        while (!tempStack.empty()) {
            stack.push(tempStack.pop());
        }

        return min;
    }
}
