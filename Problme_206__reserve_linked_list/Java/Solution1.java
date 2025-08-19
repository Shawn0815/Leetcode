package Problme_206__reserve_linked_list.Java;

public class Solution1 {
    
    public static ListNode reverseList(ListNode head) {
        // prev 指向反轉後的前一個節點，初始設為 null（因為反轉後的尾巴會指向 null）
        ListNode prev = null;

        // curr 是目前正在處理的節點，一開始從 head 開始
        ListNode curr = head;

        // 當還有節點可以處理時，就一直進行反轉
        while (curr != null) {
            // 暫存 curr 的下一個節點，避免等下指標斷掉
            ListNode nxt = curr.next;

            // 反轉指向：讓 curr 的 next 指回前一個節點
            curr.next = prev;

            // prev 前進：現在 curr 變成新的 prev
            prev = curr;

            // curr 前進：繼續處理下一個節點
            curr = nxt;
        }

        // 最後 prev 就是反轉後的頭（原本的尾巴）
        return prev;
    }
}
