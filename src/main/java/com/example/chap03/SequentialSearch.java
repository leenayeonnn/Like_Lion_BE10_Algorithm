package com.example.chap03;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] arr = {3, 29, 39, 10, 285, 2, 9};

        int idx = search(arr, 29);

        if (idx == -1) {
            System.out.println("no data");
        } else {
            System.out.println("data's index : " + idx);
        }
    }

    private static int search(int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
