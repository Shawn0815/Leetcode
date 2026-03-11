package Problem_141__Linked_List_Cycle.Java;

public class Solution {
    
    public boolean hasCycle(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
