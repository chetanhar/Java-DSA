package Tree.Questions;

//https://leetcode.com/problems/diameter-of-binary-tree/

public class DiameterOfBT {
    private static Node root;
    static int c;

    public static void main(String[] args) {
        DiameterOfBT tree = new DiameterOfBT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function Call
        System.out.println(
                "The diameter of given binary tree is : "
                        + tree.diameter());
    }

    public int diameter(){
        return diameter(root);
    }
    static int dia=0;
    private static int diameter(Node root) {
        height(root);
        return dia;
    }

    private static int height(Node node) {
        if (node == null) {
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        dia = Math.max(dia, 1+lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
