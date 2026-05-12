package org.example;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        String[] words = sentence.trim().split("\\s+");

        System.out.println(words.length);
    }
}
