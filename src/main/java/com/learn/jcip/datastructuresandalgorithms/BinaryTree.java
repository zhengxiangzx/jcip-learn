package com.learn.jcip.datastructuresandalgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    //加载数据
    public BinaryTreeNode buildTree() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("E:\\github_ku\\jcip-learn\\data\\tree.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return createTree(root, scanner);
    }

    /*
     * 根据层序遍历创建二叉树
     * */
    public BinaryTreeNode createTree(BinaryTreeNode root, Scanner scanner) {
        String string = scanner.next();
        if (string.trim().equals("#")) {
            return null;
        } else {
            root = new BinaryTreeNode(string);
            root.setLeftChild(createTree(root.getLeftChild(), scanner));
            root.setRightChild(createTree(root.getRightChild(), scanner));
            return root;
        }
    }
}