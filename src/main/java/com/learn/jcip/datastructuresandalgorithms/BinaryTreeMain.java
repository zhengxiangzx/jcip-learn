package com.learn.jcip.datastructuresandalgorithms;

public class BinaryTreeMain {
    private static BinaryTree binaryTree;

    public static void main(String[] args) {
        binaryTree = new BinaryTree();
        BinaryTreeMain.inOrderTraverse(binaryTree.buildTree());
    }

    /*
     *中序遍历 递归的方式
     * */
    public static void inOrderTraverse(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraverse(root.getLeftChild());
            System.out.print(root.getData() + " ");
            inOrderTraverse(root.getRightChild());
        }
    }
}
