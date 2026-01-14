// Problem: Find Height of Binary Tree
// Time Complexity: O(n)
// Space Complexity: O(n)

public class HeightOfTree {
    public static int height(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
