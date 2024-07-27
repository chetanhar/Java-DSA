package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        BinaryTree bt=new BinaryTree();
//        bt.populate(scanner);
//        bt.prettyDisplay();
        BST b=new BST();
        b.insert(6);
        b.insert(3);
        b.insert(8);
        b.insert(2);
        b.insert(4);
        b.insert(7);
        b.insert(9);
        b.binaryTreePaths();
        b.display();
//        b.balanced();
//        AVL avl=new AVL();
//
//        for (int i = 0; i < 1000; i++) {
//            avl.insert(i);
//        }
//        System.out.println(avl.height());
        //avl.display();
    }
}
