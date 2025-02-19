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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans = new ArrayList<String>();
        if(root!=null) path(root,ans,\\);
        return ans;
    }
    private void path(TreeNode root, List<String>ans, String str){
        if(root.left==null && root.right==null) {
            ans.add(str+root.val);
            return ;
        }
        if(root.left!=null) path(root.left, ans, str + root.val + \->\);
        if(root.right!=null) path(root.right, ans, str + root.val + \->\);
    }
}