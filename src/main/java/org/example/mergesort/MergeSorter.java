package org.example.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        //Divide the array into 2 parts.
        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }

        for (int i = mid; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }

        //Sort leftArray and rightArray to 2 separate threads.
        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService); // Task to sort left half.
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService); // Task to sort right half.

        //ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> futureLeftSortedArray = executorService.submit(leftMergeSorter);
        Future<List<Integer>> futureRightSortedArray = executorService.submit(rightMergeSorter);

        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> leftSortedArray  = futureLeftSortedArray.get(); // blocking.
        List<Integer> rightSortedArray = futureRightSortedArray.get();

        int i = 0, j = 0;

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
