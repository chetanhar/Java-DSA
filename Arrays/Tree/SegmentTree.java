package Tree;

public class SegmentTree {
    public SegmentTree(int[] arr) {
        //create a tree using this array
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = (start + end) / 2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }
        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";
        if (node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }
        System.out.println(str + '\n');
        // call recursion
        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }
    public int query(int qsi,int qei){
        return query(this.root,qsi,qei);
    }

    private int query(Node node, int qsi, int qei) {
        if(node.startInterval>=qsi&&node.endInterval<=qei){
            return node.data;
        }
        if(node.startInterval>qei||node.endInterval<qsi){
            return 0;
        }
            node.data = query(node.left, qsi, qei) + query(node.right, qsi, qei);
            return node.data;
    }
    //update
    public void update(int index,int value){
        this.root.data=update(root,index,value);
    }

    private int update(Node node, int index, int value) {
        if(node.startInterval<=index&&node.endInterval>=index){
            if (node.startInterval == index && node.endInterval == index) {
                node.data=value;
                return node.data;
            }else {
                node.left.data=update(node.left,index,value);
                node.right.data=update(node.right,index,value);
                node.data=node.left.data+node.right.data;
                return node.data;
            }
        }
        return node.data;
    }

    public static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        SegmentTree sg = new SegmentTree(arr);
        sg.update(0,9);
        sg.display();
        //System.out.println(sg.query(2,5));
    }

}
