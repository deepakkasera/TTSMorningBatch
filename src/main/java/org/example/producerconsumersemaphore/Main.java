package org.example.producerconsumersemaphore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer p1 = new Producer(store, maxSize, "P1", producerSemaphore, consumerSemaphore);
        Producer p2 = new Producer(store, maxSize, "P2", producerSemaphore, consumerSemaphore);
        Producer p3 = new Producer(store, maxSize, "P3", producerSemaphore, consumerSemaphore);

        Consumer c1 = new Consumer(store, maxSize, "C1", producerSemaphore, consumerSemaphore);
        Consumer c2 = new Consumer(store, maxSize, "C2", producerSemaphore, consumerSemaphore);
        Consumer c3 = new Consumer(store, maxSize, "C3", producerSemaphore, consumerSemaphore);
        Consumer c4 = new Consumer(store, maxSize, "C4", producerSemaphore, consumerSemaphore);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
        Thread t7 = new Thread(c4);
        t7.start();
    }
}
