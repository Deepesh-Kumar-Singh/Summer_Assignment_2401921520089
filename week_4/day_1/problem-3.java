//Sum of node of binary tree
/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int sumBT(Node root) {
        // code here
        if(root==null){
            return 0;
        }
        int leftsum=sumBT(root.left);
        int rightsum=sumBT(root.right);
        return root.data+leftsum+rightsum;
    }
}
