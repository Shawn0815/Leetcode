package Problem_143__Reorder_List.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    
    public void reorderList(ListNode head) {
        
        // 特殊情況：鏈表為空或只有一個節點，直接返回
        if (head == null || head.next == null) {
            return;
        }

        // 1. 將所有節點存入 List，方便隨機訪問
        ListNode cur = head;
        List<ListNode> list = new ArrayList<>();

        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        // 2. 雙指針法：左指針從頭，右指針從尾，交替拼接節點
        int left = 0, right = list.size() - 1;

        // 左右指針持續走，直到相遇
        while (left < right) {
            
            // 左指針節點接到右指針節點，並移動左指針
            list.get(left).next = list.get(right);
            left++;

            // 如果左右指針相遇，代表已完成拼接，跳出
            if (left == right) {
                break;
            }
            
            // 右指針節點接回左指針節點，，並移動右指針，縮小範圍
            list.get(right).next = list.get(left);
            right--;
        }

        // 3. 最後節點的 next 設為 null，避免形成環
        list.get(left).next = null;
    }
}
