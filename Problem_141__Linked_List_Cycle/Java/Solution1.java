package Problem_141__Linked_List_Cycle.Java;

import java.util.HashSet;

public class Solution1 {
    public boolean hasCycle(ListNode head) {
        // 建立一個 HashSet，用來記錄走過的節點
        HashSet<ListNode> seen = new HashSet<>();

        // curr 是目前正在走訪的節點
        ListNode curr = head;

        // 當前節點不為 null，就繼續走訪
        while (curr != null) {
            // 如果目前節點已經出現在 HashSet 中，代表有重複 → 有環
            if (seen.contains(curr)) {
                return true;
            }
            // 否則把目前節點加入 HashSet，表示已走訪過
            else {
                seen.add(curr);
            }

            // 繼續往下一個節點走
            curr = curr.next;
        }

        return false;
    }
}