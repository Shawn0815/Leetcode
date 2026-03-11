package Problem_19__Remove_Nth_Node_From_End_of_List.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // 1. 將 list 的節點加入 array 中
        ListNode cur = head;
        List<ListNode> list = new ArrayList<>();

        while (cur != null) {
            
            list.add(cur);
            cur = cur.next;
        }

        // 2. 計算要移除的 index
        int size = list.size();
        int removeIndex = size - n;

        // 如果要移除的節點是頭節點，直接 return
        if (removeIndex == 0) {
            return head.next;
        }

        // 3. 利用 array 的索引刪除節點
        list.get(removeIndex - 1).next = list.get(removeIndex).next;

        return head;
    }
}
