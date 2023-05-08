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
   public int maxLength=0;
   public void tree(TreeNode root,int dir, int Curr_length){
       if(root==null) return;
       maxLength= Math.max(maxLength, Curr_length);
       if(dir==1){
           tree(root.left,0,Curr_length+1);
           tree(root.right,1,1);
       }
       if(dir==0){
           tree(root.left,0,1);
           tree(root.right,1,Curr_length+1);
       }
       
   }
   public int longestZigZag(TreeNode root) {
       tree(root,0,0);
       tree(root,1,0);
       return maxLength;   
   }
}