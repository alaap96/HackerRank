/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        healper(root,result);
        return result;
    }
    public void healper(TreeNode root, List<Integer> result){
        // Two pointers to make the tree treaded
        TreeNode current,prev;
        // Initially current is root
        current = root;
        if(current == null) return;
        // until we complete all the nodes in the tree
        while(current != null)
        {    
            if(current.left == null)
            {
                result.add(current.val);
                current = current.right;
            }
            else
            {
                // Finding inorder predecessor of the current
                prev = current.left;
                while(prev.right != null && prev.right != current)
                {
                    prev = prev.right;
                }
                // Make the current as right child of the node so that we keep track of right subtree
                if(prev.right == null)
                {
                    prev.right = current;
                    current = current.left;
                }
                // restore the tree to original form
                else
                {
                    prev.right = null;
                    result.add(current.val);
                    current = current.right;
                }
            }
        }
    }
    
}
