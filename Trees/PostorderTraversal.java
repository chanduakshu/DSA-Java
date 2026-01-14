// Problem: Postorder Traversal of Binary Tree
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

public class PostorderTraversal {
    public static void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}
