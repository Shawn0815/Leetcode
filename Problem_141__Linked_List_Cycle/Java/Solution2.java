package Problem_141__Linked_List_Cycle.Java;

public class Solution2 {
    
    public boolean hasCycle(ListNode head) {
        // 快慢指標起點都是 head
        ListNode slow = head;
        ListNode fast = head;

        // 當 fast 及 fast.next 都不是 null，就可以繼續前進
        while (fast != null && fast.next != null) {
            // 慢指標一次走一步
            slow = slow.next;
            // 快指標一次走兩步
            fast = fast.next.next;

            // 如果快慢指標在某一點相遇，代表有環（會一直繞圈）
            if (slow == fast) {
                return true;
            }
        }

        // 若快指標先走到 null，代表沒有環（會走到底）
        return false;
    }
}
