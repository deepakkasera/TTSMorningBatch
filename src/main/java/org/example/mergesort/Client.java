package org.example.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = List.of(1, 7, 8, 4, 3, 2, 6, 5, 10, 9);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(numbers, executorService);
        Future<List<Integer>> futureSortedArray = executorService.submit(mergeSorter);

        System.out.println("DEBUG");

        System.out.println(futureSortedArray.get());
    }
}
