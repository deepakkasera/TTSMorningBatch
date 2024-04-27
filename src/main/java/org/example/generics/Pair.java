package org.example.generics;

public class Pair<A, B> {
    A first;
    B second;

    void setFirst(A first) {
        this.first = first;
    }

    void setSecond(B second) {
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    //Generic Methods.
    public static <A, B> void doSomething(A data1, B data2) {
        System.out.println("do Something");
    }

    public void doSomethingElse(A data) {
        System.out.println("Do something else");
    }
}
