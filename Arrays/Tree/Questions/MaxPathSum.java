package Tree.Questions;

import java.util.Collections;
import java.util.Comparator;

//https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class MaxPathSum {

    int maxValue=Integer.MIN_VALUE;

    public static void main(String[] args) {

    }
    public int maxPathSum(Node root) {
        maxPathDown(root);
        return maxValue;
    }
    public int maxPathDown(Node node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
