package Tree;

import java.util.ArrayList;
import java.util.List;

public class BST {
    public class Node {
        private int val;
        private Node left;
        private Node right;
        private int height;


        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private static Node root;

    public BST() {
    }

    public void insert(int val) {
        root=insert(val, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.val) {
            node.left = insert(val, node.left);
        }
        if (val > node.val) {
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    private boolean isEmpty(){
       return root==null;
    }
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }
    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);

        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }
    public static void binaryTreePaths(){
        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(Node root) {
        List<String> ls=new ArrayList<>();
        display(root,new StringBuilder(),ls);
        return ls;
    }

    private static void display(Node node, StringBuilder path, List<String> newList) {
        if(node==null){
            return;
        }
        int len=path.length();
        if(len>0){
            path.append("->");
        }
        path.append(node.val);
        if (node.left == null && node.right == null) {
            newList.add(path.toString());
        }else {
            display(node.left,path,newList);
            display(node.right,path,newList);
        }
       path.setLength(len);
    }
}
