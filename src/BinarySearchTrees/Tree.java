package BinarySearchTrees;

import BinarySearchTrees.TreeNode;

public class Tree {
    public  TreeNode insert(int data, TreeNode node){
        if(node==null){
            return getNewNode(data);
        }
        else {
            if (data<node.data){
                if(node.Left == null){
                    node.Left = getNewNode(data);
                }
                else {
                    insert(data, node.Left);
                }
            }
            else if(data> node.data){
                if(node.Right == null){
                    node.Right = getNewNode(data);
                }
                else {
                    insert(data, node.Right);
                }
            }

        }
        return node;
    }

    private TreeNode getNewNode(int data) {
        TreeNode node = new TreeNode();
        node.data= data;
        node.Left = null;
        node.Right = null;
        return node;
    }

    public void inOrder(TreeNode node){
        if(node==null){
            return;
        }
        inOrder(node.Left);
        System.out.println("Data: "+node.data);
        inOrder(node.Right);
    }
    public void preOrder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println("Data: "+node.data);
        inOrder(node.Left);
        inOrder(node.Right);
    }
    public void postOrder(TreeNode node){
        if(node==null){
            return;
        }
        inOrder(node.Left);
        inOrder(node.Right);
        System.out.println("Data: "+node.data);
    }
}
