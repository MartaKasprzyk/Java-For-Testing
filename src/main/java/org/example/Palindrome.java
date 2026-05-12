package org.example;

public class Palindrome {
    public static void main(String[] args) {
        String word = "level";
        boolean isPalindrome = true;

        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
