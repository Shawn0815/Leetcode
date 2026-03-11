package Problem_19__Remove_Nth_Node_From_End_of_List.Java;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode left = head, right = head;

        for (int i = 0; i < n; i++) {
            
            right = right.next;
        }

        if (right == null) {
            return head.next;
        }

        while (right.next != null) {

            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return head;
    }
}
