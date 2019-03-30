package com.learn.jcip.examples;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;

    public static void main(String[] args) {
        final Counter counter = new Counter();
        List<Thread> listThread = new ArrayList<>(600);
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        counter.count();
                        counter.safeCount();
                    }
                }
            });
            thread.start();
        }
        for (Thread thread : listThread) {
            thread.start();
        }
        //等待所有线程都执行完
        for (Thread thread : listThread) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("counter.i = " + counter.i);
        System.out.println("counter.atomicInteger.get() = " + counter.atomicInteger.get());
        System.out.println("time = " + (System.currentTimeMillis() - start));
    }

    /*
    * 使用CAS实现线程安全计数器
    * */
    private void safeCount() {
        for (; ; ) {
            int i = atomicInteger.get();
            boolean suc = atomicInteger.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }

    /*
    * 非线程安全计数器
    * */
    private void count() {
        i++;
    }
}
