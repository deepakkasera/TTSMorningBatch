package org.example.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 3, 7, 5, 10, 8);

        Stream<Integer> stream = numbers.stream();

        Stream<Integer> stream1 = Stream.of(1, 2, 4, 3, 7, 5, 10);

        //Builder Way of creating a Stream.
        Stream.Builder<Integer> sb = Stream.builder();
        sb.add(1);
        sb.add(2);
        sb.add(5);
        sb.add(10);
        sb.add(7);
        sb.add(6);
        sb.build();
    }
}
