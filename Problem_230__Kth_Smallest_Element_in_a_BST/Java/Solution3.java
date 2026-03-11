package Problem_230__Kth_Smallest_Element_in_a_BST.Java;

import java.util.Stack;

public class Solution3 {
    
    public int kthSmallest(TreeNode root, int k) {

        // 計算目前拜訪了幾個節點
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        // 只要還有節點可以走就繼續
        while (curr != null || !stack.isEmpty()) {

            // 先往左子樹一直走到底，沿路放進 stack 中
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // 彈出 stack 頂端，也就是 inorder 下個節點
            curr = stack.pop();
            
            // 計數器 +1
            count++;

            // 若計數器 = k，代表是第 k 個拜訪，也就是第 k 小
            // 直接回傳結果
            if (count == k) {
                return curr.val;
            }

            curr = curr.right;
        }

        return -1;
    }
}
