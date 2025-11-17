package Problem_155__Min_Stack.Java;

import java.util.Stack;

public class MinStack3 {

    private long min; // 當前最小值
    private Stack<Long> stack; // 存的是元素跟最小值間的差（Long 防止溢位）

    public MinStack3() {
        stack = new Stack<>();
    }
    
    public void push(int val) {

        // 若 stack 為空，直接推入，因為元素即為最小值
        if (stack.isEmpty()) {
            stack.push(0L);
            min = val;
        }
        // 其餘推入元素與最小值的差
        else {
            stack.push(val - min);
            
            // 出現新的最小值，更新最小值
            if (val < min) {
                min = val;
            }
        }
    }
    
    public void pop() {

        if (stack.isEmpty()) {
            return;
        }

        long pop = stack.pop();

        // 若 pop 的元素為負數，代表他是當時最小值，取出後要還原最小值
        // pop = val - 舊 min => 舊 min = val - pop（其中 val = 新 min）
        if (pop < 0) {
            min = min - pop;
        }
    }
    
    public int top() {
        
        long top = stack.peek();

        // 若頂部元素為正數 => val = min + top
        if (top > 0) {
            return (int) (min + top);
        }
        // 若為負數，代表他就是當前最小值 => val = min
        else {
            return (int) min;
        }
    }
    
    public int getMin() {

        // 直接回傳當前最小值
        return (int) min;
    }
}
