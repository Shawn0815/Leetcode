package Problem_2__Add_Two_Numbers.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution1 solution = new Solution1();

    @Test
    public void addTwoNumbersTest_01() {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode output = solution.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        while (output != null || expected != null) {
            
            assertEquals(expected.val, output.val);
            expected = expected.next;
            output = output.next;
        }
    }

    @Test
    public void addTwoNumbersTest_02() {

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode output = solution.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(0);

        while (output != null || expected != null) {
            assertEquals(expected.val, output.val);
            expected = expected.next;
            output = output.next;
        }
    }

    @Test
    public void addTwoNumbersTest_03() {

        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, 
                      new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode output = solution.addTwoNumbers(l1, l2);
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, 
                            new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        while (output != null || expected != null) {
            assertEquals(expected.val, output.val);
            expected = expected.next;
            output = output.next;
        }
    }
}
