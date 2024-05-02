package org.example.lambdas;

import java.util.function.*;

public class Client {
    public static void main(String[] args) {
//        SampleFunctionalInterface obj = new SampleFunctionalInterface();

        //Way-1
        SampleClass obj = new SampleClass();
        obj.fun1();

        //Way-2
        //Anonymous Class.
        SampleFunctionalInterface obj2 = new SampleFunctionalInterface() {
            @Override
            public void fun1() {
                System.out.println("Anonymous Class");
            }
        };

        obj2.fun1();

        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String string, Integer integer) {
                System.out.println("String " + string + ", Integer " + integer);
            }
        };

        biConsumer.accept("Scaler", 1);

        //Lambda Expression
        //3rd way in which we can provide the method body for an interface.
        Consumer<String> consumer = (x) -> {
            System.out.println("Consumer lambda implementation " + x);
        };
        consumer.accept("Scaler");

        BiConsumer<String, Integer> biConsumer1 = (x, y) -> {
            System.out.println(x  + "," + y);
        };
        biConsumer1.accept("Scaler", 1);

        //fun(T t1, T t2) returns T
        BinaryOperator<Integer> binaryOperator = (x, y) -> {
            return x + y;
        };
        System.out.println(binaryOperator.apply(10, 15)); //25

        Predicate<String> predicate = (str) -> str.length() > 10;
        System.out.println(predicate.test("ScalerBangalore"));

        BiPredicate<String, Integer> biPredicate = (str, x) -> str.length() > x;
        System.out.println(biPredicate.test("Scaler", 10));
    }
}
