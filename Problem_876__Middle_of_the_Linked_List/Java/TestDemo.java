package Problem_876__Middle_of_the_Linked_List.Java;

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
    public void middleNodeTest_01() {

        // head = [1, 2, 3, 4, 5]
        ListNode head = new ListNode(5);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        // output = [3, 4, 5]
        int[] expected = {3, 4, 5};
        ListNode outputList = solution.middleNode(head);
        int[] output = listToArray(outputList);

        assertArrayEquals(expected, output);
    }

    @Test
    public void middleNodeTest_02() {

        // head = [1, 2, 3, 4, 5, 6]
        ListNode head = new ListNode(6);
        head = new ListNode(5, head);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);

        // output = [4, 5, 6]
        int[] expected = {4, 5, 6};
        ListNode outputList = solution.middleNode(head);
        int[] output = listToArray(outputList);

        assertArrayEquals(expected, output);
    }

}
