package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NewClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 0) {
            throw new RuntimeException("Please pass non zero value for a");
        }
    }

    static void fun() throws IOException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        fileReader.read();
    }
}
