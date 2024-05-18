package org.example.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

        System.out.println("DEBUG");
    }
}
