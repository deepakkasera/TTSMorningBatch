package org.example.introtothreads;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World, Printed by " + Thread.currentThread().getName());
    }
}
