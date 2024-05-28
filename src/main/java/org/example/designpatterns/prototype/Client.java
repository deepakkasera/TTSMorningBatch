package org.example.designpatterns.prototype;

public class Client {
    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student apr23BeginnerBatch = new Student();
        apr23BeginnerBatch.setBatch("Apr23 Beginner Batch");
        apr23BeginnerBatch.setAveragePsp(70.0);
        studentRegistry.register("apr23Beginner", apr23BeginnerBatch);

        IntelligentStudent apr23IntelligentStudent = new IntelligentStudent();
        apr23IntelligentStudent.setBatch("Apr23 Beginner Batch");
        apr23IntelligentStudent.setAveragePsp(70.0);
        apr23IntelligentStudent.setIq(160);
        studentRegistry.register("apr23Intelligent", apr23IntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student sasi = studentRegistry.get("apr23Beginner").clone();
        sasi.setName("Sasi");
        sasi.setPsp(80.9);
        sasi.setAge(25);

        Student krithi = studentRegistry.get("apr23Intelligent").clone();
        krithi.setName("Krithi");
        krithi.setAge(26);

        System.out.println("DEBUG");
    }
}
