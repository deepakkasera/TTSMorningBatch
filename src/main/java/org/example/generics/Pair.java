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
}
