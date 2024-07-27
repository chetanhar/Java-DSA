package Tree.Questions;

import Tree.BST;

public class DepthofPreOrderTraversalTree {
    private static Node root;

    public static void main(String[] args) {
        String tree = "nlnnlll";
        int n = tree.length();
        DepthofPreOrderTraversalTree tree1 = new DepthofPreOrderTraversalTree();
        tree1.display(tree);
        System.out.println(tree1.insertString(tree).height);
    }

    public Node insertString(String tree) {
        int index = 0;
        return insertnew(tree, root, index);
    }

    private Node insertnew(String c, Node node, int index) {
        if (c.charAt(index) == 'l') {
            node=new Node(c.charAt(index));
            return node;
        }
        node=new Node(c.charAt(index));
        node.left = insertnew(c, node, ++index);
        node.right = insertnew(c, node, ++index);
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    private int height(Node node) {
        if(node.val=='l')
            return 0;
        return node.height;
    }

    public void display(String tree) {
        display(insertString(tree), "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }

    class Node {
        Node left;
        Node right;
        char val;
        int height;

        public Node(char val) {
            this.val = val;
        }

    }
}
