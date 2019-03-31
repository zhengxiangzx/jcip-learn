package com.learn.jcip.datastructuresandalgorithms;

import java.util.Stack;

public class Traversing {

    /*
     *中序遍历 左->根->右 递归的方式
     * */
    public void inOrderTraverse(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraverse(root.getLeftChild());
            System.out.print(root.getData() + " ");
            inOrderTraverse(root.getRightChild());
        }
    }

    /*
     * 中序遍历 非递归模式
     * */
    public void notRecursiveInOrderTraverse(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeftChild();
            }
            node = stack.pop();
            System.out.print(node.getData() + " ");
            node = node.getRightChild();
        }
    }
}
