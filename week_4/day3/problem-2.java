//Binary Tree Level Order traversal
class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();

            if (ans.size() == p.level) {
                ans.add(new ArrayList<>());
            }

            ans.get(p.level).add(p.node.val);

            if (p.node.left != null)
                q.offer(new Pair(p.node.left, p.level + 1));

            if (p.node.right != null)
                q.offer(new Pair(p.node.right, p.level + 1));
        }

        return ans;
    }
}
