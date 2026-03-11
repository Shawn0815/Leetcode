package Problem_19__Remove_Nth_Node_From_End_of_List.Java;

public class Solution2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        // 1. 計算 list 的長度
        int length = 0;
        ListNode cur = head;

        while (cur != null) {
            
            length++;
            cur = cur.next;
        }

        // 2. 計算要移除的 index
        int removeIndex = length - n;

        // 如果要移除的節點是頭節點，直接 return
        if (removeIndex == 0) {
            return head.next;
        }

        // 3. 找到要刪除的前一個節點
        cur = head;
        
        for (int i = 0; i < removeIndex; i++) {
            cur = cur.next;
        }

        // 4. 刪除節點
        cur.next = cur.next.next;

        return head;
    }
}
