package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fun();
    }

    public static void fun() {
        try {
            System.out.println("Hello");
            System.out.println("Scaler");

//            File file = new File("abc.txt");
//            FileReader fileReader = new FileReader(file);
//            System.out.println("Hey");
//            fileReader.read();

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == 10) {
                return;
            }

            System.out.println("Bangalore");
//            System.exit(0);

            int c = a/b;

            System.out.println("India");
        }
//        catch (FileNotFoundException e) {
//            System.out.println("FileNotFoundException has occurred");
//        }
//        catch (IOException e) {
//            System.out.println("IOException has occurred");
//        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException has occurred");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException has occurred");
        }
        catch (Exception e) {
            System.out.println("Exception has occurred");
        }
        finally {
            System.out.println("Finally Block");
            //Finally Block gets executed even we have a return statement in the try block.
        }
        System.out.println("After Try, Catch & Finally");
    }
}
