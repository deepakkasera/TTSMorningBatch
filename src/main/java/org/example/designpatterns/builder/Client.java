package org.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Sahil");
//        builder.setBatch("Apr23 Tuesday Beginner Morning");
//        builder.setGradYear(2021);
//        builder.setPsp(89.0);
////        builder.setAge(25);
////        builder.setUniversityName("Scaler");
//
//        //Student student = new Student(builder);
//        Student student = builder.build();

        Student student = Student.getBuilder()
                                 .setName("Deepak")
                                         .setBatch("Apr23 Beginner")
                                                 .setGradYear(2021)
                                                         .setUniversityName("Scaler")
                                                                 .setPsp(90)
                                                                         .build();

        System.out.println("DEBUG");
    }
}
