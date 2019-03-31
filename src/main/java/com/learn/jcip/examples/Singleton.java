package com.learn.jcip.examples;

public class Singleton {

}

class NotSafeSingleton {
    private static NotSafeSingleton instance;

    private NotSafeSingleton() {
    }

    public static NotSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NotSafeSingleton();
        }
        return instance;
    }

}

class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    public SynchronizedSingleton() {
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}

class SafeSingleton {
    private volatile static SafeSingleton instance;

    private SafeSingleton() {
    }

    public static SafeSingleton getInstance() {
        if (instance == null) {
            synchronized (SafeSingleton.class) {
                if (instance == null) {
                    instance = new SafeSingleton();
                }
            }
        }
        return instance;
    }
}