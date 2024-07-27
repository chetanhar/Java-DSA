package Tree.Questions;

import Tree.BST;

public class SameTree {
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
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);
        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);
        SameTree s = new SameTree();
        s.isSameTree(p, q);

    }

    public boolean isSameTree(Node p, Node q) {
        if (p == null & q == null) {
            return true;
        }
        if ((p != null && q != null) && (p.val == q.val)) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left == true && right == true;
        } else {
            return false;
        }
    }
}
