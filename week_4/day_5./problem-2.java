//Lowest Common Ancestors of Binary tree
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        if (root == p || root == q) return root;

        boolean pLeft = exists(root.left, p.val);
        boolean qLeft = exists(root.left, q.val);

        if (pLeft && qLeft)
            return lowestCommonAncestor(root.left, p, q);

        if (!pLeft && !qLeft)
            return lowestCommonAncestor(root.right, p, q);

        return root;
    }

    boolean exists(TreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        return exists(root.left, val) || exists(root.right, val);
    }
}
