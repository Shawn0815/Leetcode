package Problem_2__Add_Two_Numbers.Java;

public class Solution1 {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 用 dummy node 來接計算完的數字
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        // 用來記錄是否有進位
        int carry = 0;
        
        // 只有其中一條 Linked List 還沒走完就繼續計算
        while (l1 != null || l2 != null) {

            // 若當前 List 已走完，視它的數字為 0
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            
            // 計算兩數字總合（包含 carry）
            int add = v1 + v2 + carry;

            // 插入新節點，放「總和的個位數」
            curr.next = new ListNode((add % 10));

            // 計算是否進位
            carry = add / 10;

            // 移動指標
            curr = curr.next;
            l1 =  (l1 != null) ? l1.next : null;
            l2 =  (l2 != null) ? l2.next : null;
        }

        // 每位數字算完還有進位，補上一個節點 1
        if (carry != 0) {
            curr.next = new ListNode(1);
        }

        // 最後回傳 dummy 的下一個節點
        return dummy.next;
    }
}
