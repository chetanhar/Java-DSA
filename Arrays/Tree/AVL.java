package Tree;

public class AVL {
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

    private Node root;

    public AVL() {
    }

    public void insert(int val) {
        root = insert(val, root);
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
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                //left left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }

        if (height(node.left) - height(node.right) < -1) {
            //right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                //right right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                //right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return p;
    }

    private Node rightRotate(Node node) {
        Node c = node.left;
        Node t = c.right;
        c.right = node;
        node.left = t;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return c;
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private boolean isEmpty() {
        return root == null;
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

}
