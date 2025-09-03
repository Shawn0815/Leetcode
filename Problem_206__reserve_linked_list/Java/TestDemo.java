package Problem_206__reserve_linked_list.Java;

public class TestDemo {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        // 印出原始串列
        System.out.println("Original list: ");
        printlist(head);
        
        // 印出反轉後的串列
        System.out.println("Reserved list: ");
        printlist(Solution1.reverseList(head));

        // 印出反轉後的串列
        // System.out.println("Reserved list: ");
        // printlist(Solution2.reverseList(head));
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
