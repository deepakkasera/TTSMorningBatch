package org.example.collections;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(100);
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(50);
//        numbers.add(5);
//        numbers.add(70);
//
//        System.out.println(numbers.size());
//
//        for (Integer number : numbers) {
//            System.out.print(number + " ");
//        }

//        Set<String> set = new LinkedHashSet<>();
//        set.add("India");
//        set.add("USA");
//        set.add("China");
//        set.add("Pakistan");
//        set.add("SriLanka");
//        set.add("UAE");
//        set.add("Bangladesh");
//
//        for (String name : set) {
//            System.out.print(name + " ");
//        }

        Car car1 = new Car("A", 800, 250);
        Car car2 = new Car("B", 1120, 270);
        Car car3 = new Car("C", 200, 150);
        Car car4 = new Car("D", 100, 50);
        Car car5 = new Car("E", 1100, 300);
        Car car6 = new Car("F", 700, 120);

        Queue<Car> pq = new PriorityQueue<>();

        pq.add(car1);
        pq.add(car2);
        pq.add(car3);
        pq.add(car4);
        pq.add(car5);
        pq.add(car6);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().toString());
            pq.poll();
        }
    }
}
