//package Tree;
//
//public class AVLClone {
//
//    class Node {
//        private int val;
//        private Node left;
//        private Node right;
//        private int height;
//
//        public Node(int val) {
//            this.val = val;
//        }
//    }
//
//    private Node root;
//
//    private void insert(int val) {
//        root = insert(root, val);
//    }
//
//    private Node insert(Node node, int val) {
//        if (node == null) {
//            node = new Node(val);
//            return node;
//        }
//        if (val < node.val) {
//            node.left = insert(node.left, val);
//        } else if (val > node.val) {
//            node.right=insert(node.right,val);
//        }
//        node.height=Math.max(height(node.left),height(node.right)+1);
//        return rotate(node);
//    }
//
//    private Node rotate(Node node) {
//        //left heavy
//        if(height(node.left)-height(node.right)>1){
//            //left left case
//            if(height(node.left.left)-height(node.left.right)>0){
//                return rotateRight(node);
//            }else{
//                //left right case
//                node.left=rotateLeft(node.left);
//                return rotateRight(node);
//            }
//        }//right heavy
//        if(height(node.left)-height(node.right)<-1){
//            //right right case
//            if(height(node.right.right)-height(node.right.left)>0){
//                return rotateLeft(node);
//            }else{
//                //right left case
//                node.right=rotateRight(node.right);
//                return rotateLeft(node);
//            }
//        }
//        return node;
//    }
//
//    private Node rotateLeft(Node node) {
//        Node c=node.right;
//        Node t=c.left;
//        c.left=node;
//        node.right=t;
//
//        return c;
//    }
//
//    private Node rotateRight(Node node) {
//    }
//
//    private int height(Node node) {
//        if(node==null){
//            return 0;
//        }
//        return node.height;
//    }
//}
