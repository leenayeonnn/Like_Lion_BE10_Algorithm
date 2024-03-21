package com.example.chap06;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 39, 27, 3, 9, 20};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int idx;
        for (int i = 0; i < arr.length - 1; i++) {
            idx = SelectionSort.findMinIndex(arr, i);
            SelectionSort.swap(arr, i, idx);
        }
    }

    private static int findMinIndex(int[] arr, int startIdx) {
        int minIdx = startIdx;

        for (int i = startIdx + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
