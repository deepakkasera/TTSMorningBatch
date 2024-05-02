package org.example.lambdas.runnable;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello World, printed by " + Thread.currentThread().getName());

        Runnable runnable = () -> System.out.println("Hello World, printed by " + Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(
                () -> System.out.println("Hello World, printed by " + Thread.currentThread().getName())
        );
        thread1.start();
    }
}
