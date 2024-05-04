package org.example.streams;

import org.example.lambdas.comparator.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 9, 7, 5, 4, 2, 10, 14, 17, 19, 16);

        //Write a method to extract only the odd numbers from the list.
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number%2 == 1) oddNumbers.add(number);
        }
        System.out.println(oddNumbers);

        //How can we do the above operation using Streams.
        List<Integer> oddNumbers1 = numbers.stream().filter((x) -> x%2 == 1).toList();
        System.out.println(oddNumbers1);


        //How the above stream is working ?
        //1. List converted to Stream.
        //2. Stream will loop over the elements in the list.
        //3. Every element will be passed in the method.
        //4. lambda function will be applied over each element.
        //5. If lambda expression returns true, that element will be added to the final stream, else it will be rejected.
        //6. Finally we'll convert the stream back to the list.

        List<Student> students = Arrays.asList(new Student("Sasi", 4, 85),
                new Student("Rishi", 1, 80),
                new Student("Deepak", 3, 76),
                new Student("Krithi", 2, 92));

        System.out.println(students.stream().filter((student) -> student.marks > 80).toList());

        //Iterate over the list and get the marks of each student.
        System.out.println(students.stream().map(student -> student.name).toList());

        List<String> words = Arrays.asList("scaler", "bangalore", "india", "class", "oops", "streams", "java");
        //Count the number of words with length > 5.
        System.out.println(words.stream().filter(word -> word.length() > 4).count());

        //Convert the list of words to UPPER CASE.
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseWords);
    }
}
