/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);

        return diameter;
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int lefttree = height(root.left);
        int righttree = height(root.right);

        diameter = Math.max(diameter,lefttree+righttree);

        return 1+Math.max(lefttree,righttree);
    }
}
