package com.learn.jcip.datastructuresandalgorithms;

public class BinaryTree {
    private BinaryTreeNode root;

    BinaryTree() {
    }

    BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    /*
        * 根据层序遍历创建二叉树
        * */
    public BinaryTreeNode createTree(BinaryTreeNode root, String[] data) {
        if (data != null) {
            for (String string : data) {

            }
            return null;
        } else {
            return null;
        }

    }
}