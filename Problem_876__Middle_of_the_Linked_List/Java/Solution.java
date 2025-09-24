package Problem_876__Middle_of_the_Linked_List.Java;

public class Solution {
    
    public ListNode middleNode(ListNode head) {
        
        // 快慢指針各自從 head 開始走
        ListNode slow = head, fast = head;

        // 慢指針一次走一步，快指針一次走兩步，直到快指針走到底
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // 快指針走到終點時，慢指針剛好會走到中間
        return slow;
    }
}
