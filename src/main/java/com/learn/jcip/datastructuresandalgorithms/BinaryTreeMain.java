package com.learn.jcip.datastructuresandalgorithms;

public class BinaryTreeMain {
    private static Traversing traversing;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("中序遍历-递归模式");
        traversing = new Traversing();
        traversing.inOrderTraverse(binaryTree.buildTree());
        System.out.println("\n中序遍历-非递归模式");
        traversing.notRecursiveInOrderTraverse(binaryTree.buildTree());
    }


}
