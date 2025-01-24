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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),root,targetSum);
        return list;
    }
    private static void backtrack(List<List<Integer>>list,List<Integer>li,TreeNode root,int sum){

        if(root==null){
            return ;
        }
        li.add(root.val);
        if(root.left==null && root.right==null && sum-root.val==0){
            list.add(new ArrayList<>(li));
        }
       else{
        backtrack(list,li,root.left,sum-root.val);
        backtrack(list,li,root.right,sum-root.val);
    }
    li.remove(li.size()-1);
}
}