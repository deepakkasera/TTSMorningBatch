package org.example.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Pair pair = new Pair();
//        pair.first = 2.345678;
//        pair.second = "1.23456";
//
//        double x = (Double) pair.first;
//        double y = (Double) pair.second;
//
//        System.out.println("DEBUG");

        Pair<String, Integer> p1 = new Pair<>();
        p1.first = "Scaler";
        p1.second = 1;

        Pair<Double, Double> p2 = new Pair<>();
        p2.first = 1.23456;
        p2.second = 2.34567;

        List<Pair> pairs = new ArrayList<>();
        pairs.add(p1);
        pairs.add(p2);

        //RAW TYPES
        //Before Java 5
        HashMap hm = new HashMap();
        //object, object.
//        hm.put("Scaler", 1);
//        hm.put("Deepak", 10);
//        hm.put(2.33454, 1.23434);
        hm.put("India", 140);
        hm.put("USA", "UK"); //No Compile time safety.

        //After Java 5 -> Generics were launched.
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("India", 140);
        hashMap.put("USA", 50);
        //Backward Compatibility

        List<Integer> numbers = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();

        Pair.doSomething("Scaler", 1);
        Pair.doSomething(10000, 2000L);
        Pair.doSomething(1.2345, 2.4567);
        Pair.doSomething(numbers, names);

        System.out.println("DEBUG");

    }
}
