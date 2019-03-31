package com.learn.jcip.datastructuresandalgorithms;

public class BinaryTreeNode {
    private String data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    BinaryTreeNode() {

    }

    BinaryTreeNode(String data) {
        super();
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    BinaryTreeNode(String data, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
        super();
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }


    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }


}
