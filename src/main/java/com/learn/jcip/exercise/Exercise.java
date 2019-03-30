package com.learn.jcip.exercise;

public class Exercise {
    public Exercise() {
        System.out.println("无参构造函数");
    }

    public Exercise(String name) {
        System.out.println(name);
    }

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public static void exercise() {
        System.out.println("普通方法");
    }

    public static void main(String[] args) {
        Exercise.exercise();
        new Exercise();
        System.out.println("---------------------------------");
        new Exercise("有参构造函数");
    }
}
