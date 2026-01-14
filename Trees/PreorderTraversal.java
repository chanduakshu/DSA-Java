// Problem: Preorder Traversal of Binary Tree
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

public class PreorderTraversal {
    public static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
