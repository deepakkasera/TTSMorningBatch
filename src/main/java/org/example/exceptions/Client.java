package org.example.exceptions;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //int b = Integer.parseInt(scanner.next());

        System.out.println("Hello");

        System.out.println(a/b);
    }
}
