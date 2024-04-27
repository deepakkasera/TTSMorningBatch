package org.example.collections;

public class Car implements Comparable<Car> {
    String name;
    int price;
    int speed;

    public Car(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car other) {
        return other.speed - this.speed; // < 0
    }

    @Override
    public String toString() {
        return "[Name= " + this.name + ", Speed= " + this.speed + ", Price= " + this.price + "]";
    }
}
