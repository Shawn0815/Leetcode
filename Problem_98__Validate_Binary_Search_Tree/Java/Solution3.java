package Problem_98__Validate_Binary_Search_Tree.Java;

import java.util.Stack;

public class Solution3 {
    
    public boolean isValidBST(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode prev = null;

        // 只要還有節點可以走就繼續
        while (curr != null || !stack.isEmpty()) {

            // 先往左子樹一直走到底，沿路放進 stack 中
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // 彈出 stack 頂端，也就是 inorder 下個節點
            curr = stack.pop();

            // 處理當前節點，判斷是否小於上一個拜訪的節點
            if (prev != null && curr.val <= prev.val) {
                return false;
            }

            // 更新上一個拜訪的節點為當前節點
            prev = curr;

            // 移動到右子樹，重複上述動作
            curr = curr.right;
        }

        return true;
    }
}
