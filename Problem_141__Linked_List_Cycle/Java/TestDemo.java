package Problem_141__Linked_List_Cycle.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();
    
    @Test
    public void hasCycleTest_01() {

        // 測試 1：沒有環的 linked list：1 → 2 → 3 → null
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        
        head.next = node2;
        node2.next = node3;

        boolean output = solution.hasCycle(head);
        boolean expected = false;
        
        assertEquals(expected, output);
    }

    @Test
    public void hasCycleTest_02() {

        // 測試 2：有環的 linked list：1 → 2 → 3 → 2 (回圈)
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        
        head.next = node2;
        node2.next = node3;
        node3.next = node2; // 建立環

        boolean output = solution.hasCycle(head);
        boolean expected = true;
        
        assertEquals(expected, output);
    }
}
