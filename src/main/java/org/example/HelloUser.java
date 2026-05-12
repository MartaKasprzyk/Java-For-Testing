package org.example;

import java.util.Scanner;

public class HelloUser {
    public static String helloUser(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(helloUser(name));

        scanner.close();
    }
}
