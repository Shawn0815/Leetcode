package Problem_143__Reorder_List.Java;

public class Solution {
    
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) {
            return;
        }

        // 1. 找中點
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next; 
        }

        // 2. 反轉右半鏈表
        ListNode prev = null, cur = slow.next;
        slow.next = null; // 段開左邊

        while (cur != null) {

            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // 3. 合併左右鏈表
        ListNode first = head, second = prev;

        while (second != null) {

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
