package org.example;

import java.util.Scanner;

public class MonthToSeason {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();

        switch (month) {
            case 12, 1, 2:
                System.out.println("Season: Winter");
                break;
            case 3, 4, 5:
                System.out.println("Season: Spring");
                break;
            case 6, 7, 8:
                System.out.println("Season: Summer");
                break;
            case 9, 10, 11:
                System.out.println("Season: Autumn");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
