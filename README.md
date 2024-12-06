# Video_Project-greewa23

Problem: Kth Smallest Element in a BST
Description: Given the root of a binary search tree, and an integer k, return the kth smallest value out of all the values of the nodes in the BST.
Instructions: Create a main function and a TreeNode object. You can then create a BST from multiple TreeNodes. You may provide left and right nodes for an object. Then, call the function kthSmallest(TreeNode root, int k) with the root of your BST and an int k to find the kth smallest element in the BST. I have provided an example below:
public static void main(String[] args) {
      TreeNode root = new TreeNode(3, new TreeNode(2), new TreeNode(4));
      int x = kthSmallest(root, 2);
      System.out.println(x);
    }
