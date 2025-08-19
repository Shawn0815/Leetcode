package Problme_206__reserve_linked_list.Java;

public class Solution2 {
    
    public static ListNode reverseList(ListNode head) {
        // 如果 head 為 null，或只有一個節點，直接回傳即可（無需反轉）
        if (head == null || head.next == null) {
            return head;
        }

        // 遞迴反轉後面的節點，newHead 是反轉後的尾巴（也會變成新的頭）
        ListNode newHead = reverseList(head.next);

        // 把後一個節點指回自己（實現反轉）
        head.next.next = head;

        // 將自己與後面斷開，避免成為循環
        head.next = null; 

        // 回傳新的頭節點
        return newHead;
    }
}
