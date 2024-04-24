package org.example.producerconsumermutex;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;

    Producer(Queue<Object> store, int maxSize, String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.size() < maxSize) { // lock on store.
                    System.out.println("Producer: " + this.name + " has produced the shirt, store size: " + this.store.size());
                    store.add(new Object());
                }
            }
        }
    }
}
