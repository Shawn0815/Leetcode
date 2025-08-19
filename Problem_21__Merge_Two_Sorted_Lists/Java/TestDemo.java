package Problem_21__Merge_Two_Sorted_Lists.Java;

public class TestDemo {
    public static void main(String[] args) {
        ListNode l1_head = new ListNode(4);
        l1_head = new ListNode(2, l1_head);
        l1_head = new ListNode(1, l1_head);

        ListNode l2_head = new ListNode(4);
        l2_head = new ListNode(3, l2_head);
        l2_head = new ListNode(1, l2_head);

        Solution sol = new Solution();
        ListNode new_head = sol.mergeTwoLists(l1_head, l2_head);

        printlist(new_head);
    }

    public static void printlist(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);
            
            if (curr.next != null) {
                System.out.print(" -> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }
}
