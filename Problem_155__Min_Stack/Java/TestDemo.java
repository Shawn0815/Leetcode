package Problem_155__Min_Stack.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    MinStack minStack = new MinStack();

    // MinStack1 minStack = new MinStack1();
    // MinStack2 minStack = new MinStack2();
    // MinStack3 minStack = new MinStack3();

    @Test
    public void minStackTest_01() {

        int min = 0, top = 0;
        int expected = 0;

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        min = minStack.getMin();
        expected = -3;
        assertEquals(expected, min);

        minStack.pop();
        
        top = minStack.top();
        expected = 0;
        assertEquals(expected, top);

        min = minStack.getMin();
        expected = -2;
        assertEquals(expected, min);
    }
}
