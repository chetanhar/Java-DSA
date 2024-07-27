package Tree.Questions;

import Tree.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BTinOrderTraversal {
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int value) {
            this.val = value;
        }
    }

    private static Node root;
    public static void main(String[] args) {
        System.out.println(inorderTraversal(root));
    }
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> ls=new ArrayList<>();
        if (root == null) {
            return ls;
        }
        ls.addAll(inorderTraversal(root.left));
        ls.add(root.val);
        ls.addAll(inorderTraversal(root.right));
        return ls;
    }
}
