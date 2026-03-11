package Problem_230__Kth_Smallest_Element_in_a_BST.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    
    public int kthSmallest(TreeNode root, int k) {

        // 將拜訪過的節點依序放入 list 中
        List<Integer> list = new ArrayList<>();
        
        // Inorder traversal 遞迴函式
        dfs(root, list);

        // 第 k 個元素即為第 k 小的元素
        return list.get(k - 1);
    }

    public void dfs(TreeNode node, List<Integer> list) {

        // 空節點，直接 return
        if (node == null) {
            return;
        }

        // 拜訪左子樹
        dfs(node.left, list);

        // 處理當前節點，放入 list 中
        list.add(node.val);

        // 拜訪右子樹
        dfs(node.right, list);
    }
}
