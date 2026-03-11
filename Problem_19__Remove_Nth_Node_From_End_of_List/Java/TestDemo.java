package Problem_19__Remove_Nth_Node_From_End_of_List.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();

    // 輔助函數：把鏈表轉成陣列
    private int[] listToArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void removeNthFromEndTest_01() {

        // head = [1, 2, 3, 4]
        ListNode head = new ListNode(5);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        int n = 2;

        // output = [1, 2, 3, 5]
        int[] expected = {1, 2, 3, 5};
        ListNode outputList = solution.removeNthFromEnd(head, n);
        int[] output = listToArray(outputList);

        assertArrayEquals(expected, output);
    }

    @Test
    public void removeNthFromEndTest_02() {

        // head = [1]
        ListNode head = new ListNode(1);

        int n = 1;

        // output = []
        int[] expected = {};
        ListNode outputList = solution.removeNthFromEnd(head, n);
        int[] output = listToArray(outputList);

        assertArrayEquals(expected, output);
    }

    @Test
    public void removeNthFromEndTest_03() {

        // head = [1, 2]
        ListNode head = new ListNode(2);
        head = new ListNode(1, head);

        int n = 1;

        // output = [1]
        int[] expected = {1};
        ListNode outputList = solution.removeNthFromEnd(head, n);
        int[] output = listToArray(outputList);

        assertArrayEquals(expected, output);
    }
}
