// Problem: Inorder Traversal of Binary Tree
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

public class InorderTraversal {
    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
