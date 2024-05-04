package org.example.lambdas.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Sasi", 4, 85),
                new Student("Rishi", 1, 80),
                new Student("Deepak", 3, 76),
                new Student("Krithi", 2, 92));

        //Comparator
        Comparator<Student> marksComparator = (st1, st2) -> st1.marks - st2.marks;
        Comparator<Student> rollNumberComparator = (st1, st2) -> st1.rollNumber - st2.rollNumber;
        Collections.sort(students, rollNumberComparator);
        System.out.println(students);
    }
}
