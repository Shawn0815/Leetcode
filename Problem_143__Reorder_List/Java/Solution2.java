package Problem_143__Reorder_List.Java;

public class Solution2 {
    
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) {
            return;
        }

        // 1. 找中點（fast-slow pointer）
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            
            // 慢指針走一步，快指針走兩步
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
        ListNode first = head, second = prev; // prev 會是右半 list 的頭

        // 依序將右半 list 插入到左半 list 中
        while (second != null) {

            // 暫存左半、右半 list 的下一個節點
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            // 左節點接右節點，右節點接回左節點下一個
            first.next = second;
            second.next = temp1;

            // 移動左右鏈表的頭至各自的下個節點
            first = temp1;
            second = temp2;
        }
    }
}
