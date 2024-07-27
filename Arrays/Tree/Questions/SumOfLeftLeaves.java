package Tree.Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/sum-of-left-leaves/description/
public class SumOfLeftLeaves {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    private static TreeNode root;
    static int sum;
    public static void main(String[] args) {

    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        totalLeftSum(root.left,true);
        totalLeftSum(root.right,false);
        return sum;
    }

    private void totalLeftSum(TreeNode node,boolean status)  {
        if(node==null){
            return;
        }
        if(status&&node.left==null&&node.right==null){
            sum+=node.val;
        }
        totalLeftSum(node.left,true);
        totalLeftSum(node.right,false);
    }
}
