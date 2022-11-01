package BinarySearchTrees;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = null;
        root=tree.insert(5,root);
        root=tree.insert(25,root);
        root=tree.insert(1,root);
        root=tree.insert(7,root);
        System.out.println("INORDER-------------------");
        tree.inOrder(root);
        System.out.println("PREORDER-------------------");
        tree.preOrder(root);
        System.out.println("POSTORDER-------------------");
        tree.postOrder(root);

    }
}
