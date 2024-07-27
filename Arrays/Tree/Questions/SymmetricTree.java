package Tree.Questions;

public class SymmetricTree {
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

    }
    public boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
    public Node invertTree(Node root) {
        if(root==null){
            return null;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
