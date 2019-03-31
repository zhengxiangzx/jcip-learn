package com.learn.jcip.datastructuresandalgorithms;

public class BinaryTreeMain {
    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", " ", "3", "4", "5", "6", "7"};
        BinaryTree binaryTree = new BinaryTree();
        BinaryTreeNode tt = binaryTree.createTree(binaryTree.getRoot(), strings);
        System.out.println(tt);
    }
}
