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
    private Map<TreeNode, Integer> m =new HashMap<>();
    public int rob(TreeNode root) {
        
        if(root==null) return 0;
        if(m.containsKey(root)) return m.get(root);
        int r=root.val;
        if(root.left!=null) r+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null) r+=rob(root.right.left)+rob(root.right.right);
        int skip=rob(root.left)+rob(root.right);
        int res=Math.max(r, skip);
        m.put(root,res);
        return res;
        
    }
}