package Problem_141__Linked_List_Cycle.Java;

public class TestDemo {
    public static void main(String[] args) {
        // Solution1 solution = new Solution1();
        Solution2 solution = new Solution2();

        // 測試 1：沒有環的 linked list：1 → 2 → 3 → null
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        
        node1.next = node2;
        node2.next = node3;

        System.out.println("Test 1 - no cycle: " + solution.hasCycle(node1)); // 預期 false

        // 測試 2：有環的 linked list：1 → 2 → 3 → 2 (回圈)
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
        
        node4.next = node5;
        node5.next = node6;
        node6.next = node5; // 建立環

        System.out.println("Test 2 - has cycle: " + solution.hasCycle(node4)); // 預期 true
    }
}
