package BinarySearchTrees;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = null;

        //TODO:------------------TASK 1-----------------
        root=tree.insert(60,root);
        root=tree.insert(41,root);
        root=tree.insert(74,root);
        root=tree.insert(16,root);
        root=tree.insert(53,root);
        root=tree.insert(25,root);
        root=tree.insert(46,root);
        root=tree.insert(55,root);
        root=tree.insert(65,root);
        root=tree.insert(63,root);
        root=tree.insert(70,root);
        root=tree.insert(42,root);
        root=tree.insert(62,root);
        root=tree.insert(64,root);
        //TODO: ------------------TASK 2---------------------
        tree.search(70, root);

        //TODO: ------------------TASK 3---------------------
//        System.out.println("INORDER-------------------");
//        tree.inOrder(root);
//        System.out.println("PREORDER-------------------");
//        tree.preOrder(root);
//        System.out.println("POSTORDER-------------------");
//        tree.postOrder(root);




    }
}
