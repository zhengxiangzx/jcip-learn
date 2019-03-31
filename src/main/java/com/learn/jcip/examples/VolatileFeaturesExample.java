package com.learn.jcip.examples;

public class VolatileFeaturesExample {
    public static void main(String[] args) throws InterruptedException {
        VolatileFeaturesDemo1 volatileFeatures = new VolatileFeaturesDemo1();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                volatileFeatures.set(1000);
                System.out.println("thread1.set(vl) = " + volatileFeatures.get());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                volatileFeatures.getAndIncrement();
                System.out.println("thread2.get(vl) = " + volatileFeatures.get());
            }
        });
        thread1.start();
        thread2.start();
    }

    static class VolatileFeaturesDemo1 {
        volatile long vl = 0l;

        //对单个volatile的变量的写具有原子性
        public void set(long l) {
            vl = l;
        }

        //对符合的这种操作不具有原子性操作
        public void getAndIncrement() {
            vl++;
        }

        //对单个volatile的变量的读具有原子性
        public long get() {
            return vl;
        }
    }

    static class VolatileFeaturesDemo2 {
        volatile long vl = 0l;

        public synchronized void set(long l) {
            vl = l;
        }

        public void getAndIncrement() {
            vl++;
        }

        public synchronized long get() {
            return vl;
        }
    }
}
