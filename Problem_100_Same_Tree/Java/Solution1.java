package Problem_100_Same_Tree.Java;

public class Solution1 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果兩棵樹都為 null，表示相同
        if (p == null && q == null) {
            return true;
        }

        // 如果其中一棵樹為 null，或者節點值不相同，返回 false
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
