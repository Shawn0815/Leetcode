package Problem_21__Merge_Two_Sorted_Lists.Java;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 建立一個 dummy 起點節點，方便統一串接邏輯
        ListNode dummy = new ListNode(0);

        // tail 負責往後接節點，初始位置在 dummy
        ListNode tail = dummy;

        // 當兩個 list 都還有節點時，進行比較與串接
        while (l1 != null && l2!= null) {
            // l1 比較小，接到 tail 後面，並移動 l1
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            }
            // l2 比較小，接到 tail 後面，並移動 l2
            else {
                tail.next = l2;
                l2 = l2.next;
            }
            
            // 將 tail 移到剛剛接上的節點
            tail = tail.next;
        }

        // 如果其中一個 list 還有剩，直接接上尾巴（剩下的一定是已排序）
        if (l1 != null) {
            tail.next = l1;
        }
        else if (l2 != null) {
            tail.next = l2;
        }

        // 回傳合併後 list 的頭（跳過 dummy）
        return dummy.next;
    }
}
