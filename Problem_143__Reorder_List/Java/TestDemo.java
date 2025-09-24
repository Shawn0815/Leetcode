package Problem_143__Reorder_List.Java;

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
    public void reorderListTest_01() {

        // head = [1, 2, 3, 4]
        ListNode head = new ListNode(4);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        // output = [1, 4, 2, 3]
        int[] expected = {1, 4, 2, 3};
        solution.reorderList(head);
        int[] output = listToArray(head);

        assertArrayEquals(expected, output);
    }

    @Test
    public void reorderListTest_02() {

        // head = [1, 2, 3, 4, 5]
        ListNode head = new ListNode(5);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        // output = [1, 5, 2, 4, 3]
        int[] expected = {1, 5, 2, 4, 3};
        solution.reorderList(head);
        int[] output = listToArray(head);

        assertArrayEquals(expected, output);
    }
}
