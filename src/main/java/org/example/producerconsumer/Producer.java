package org.example.producerconsumer;

import java.util.Objects;
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
            if (store.size() < maxSize) {
                //System.out.println("Producer: " + this.name + " has produced the shirt, store size: " + this.store.size());
                store.add(new Object());
            }
        }
    }
}
