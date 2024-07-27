package Tree;


import java.util.List;
import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {
    }

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int value) {
            this.val = value;
        }
    }

    private Node root;

    //insert Element
    public void populate(Scanner scanner) {
        System.out.println("Enter the root NOde");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to Enter the left of " + node.val);
        boolean isLeft = scanner.nextBoolean();
        if (isLeft) {
            System.out.println("Enter the left of " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter the right of " + node.val);
        boolean isRight = scanner.nextBoolean();
        if (isRight) {
            System.out.println("Enter the right of " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }
    }

    //display
    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.val + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.val + " ");
    }



}
