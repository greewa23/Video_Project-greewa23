/**********************************************************************
 * @file Solution.java
 * @brief This program implements the Solution class. It
 * finds the kth smallest element in a BST.
 * @author Wynne Greene
 * @date: December 6, 2024
 ***********************************************************************/
import java.util.LinkedList;

class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    /*
    Given the root of a binary search tree, and an integer k, return the kth smallest
    value of all the values of the nodes in the tree.
     */
    public static int kthSmallest(TreeNode root, int k) {
        //Declare variables
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;
        int count = 0; //count will tell us if we have reached the kth smallest number
        //Even if curr is null, the stack still have nodes, continue traversing tree
        //if curr is null and the stack is empty, we cannot find the kth smallest node
        while(!stack.isEmpty() || curr != null) {
            //push nodes onto the stack, choosing the left node each time until it is null
            //pop the top element in the stack, if count equals k, return the node's value
            //Otherwise, set curr equal to the right node
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;

            } else {
                TreeNode node = stack.pop();
                count++;
                if(count == k) {
                    return node.val;
                }
                //Since the node we popped was still to small, we move into the
                //right side of the subtree to find a larger node.
                curr = node.right;
            }
        }
        //The root was null or k was larger than the number of nodes in the tree
        return -1;
    }
}
