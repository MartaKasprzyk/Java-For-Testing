package org.example;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Validate your password: ");
        String password = scanner.nextLine();

        boolean hasValidLength = password.length() >= 7 && password.length() <= 13;
        boolean hasUppercase = false;
        boolean hasAtSymbol = password.contains("@");
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (!hasValidLength) {
            System.out.println("Password must be 7–13 characters long.");
        } else if (!hasUppercase) {
            System.out.println("Password must contain at least one uppercase letter.");
        } else if (!hasAtSymbol) {
            System.out.println("Password must contain '@' symbol.");
        } else if (!hasDigit) {
            System.out.println("Password must contain at least one number.");
        } else {
            System.out.println("Password match the requirements");
        }
    }
}
