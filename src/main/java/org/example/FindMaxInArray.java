package org.example;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 9};
        int max = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
        }

        System.out.println(max);
    }
}
