package Tree.Questions;

import Tree.AVL;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class SortedArrrayToBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private static TreeNode root;

    public static void main(String[] args) {
        int[] nums={-10,-3,0,5,9};
        root=sortedArrayToBST(nums);
        display();
    }
    public static void display() {
        display(root, "Root Node: ");
    }

    private static void display(TreeNode node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArr(nums,0,nums.length-1);
    }

    private static TreeNode sortedArr(int[] nums, int s, int e) {
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode tn=new TreeNode(nums[mid]);
        tn.left=sortedArr(nums,s,mid-1);
        tn.right=sortedArr(nums, mid+1, e);
        return tn;
    }
}
