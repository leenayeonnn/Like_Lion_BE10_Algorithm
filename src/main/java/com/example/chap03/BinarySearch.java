package com.example.chap03;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 6, 17, 29, 40, 55, 60, 78};

//        int idx = search(arr, 0, 0, arr.length - 1);
        int idx = search(arr, 60);

        if (idx == -1) {
            System.out.println("no data");
        } else {
            System.out.println("data's index : " + idx);
        }
    }

//    private static int search(int[] arr, int key, int firstIdx, int lastIdx) {
//
//        if (firstIdx > lastIdx) {
//            return -1;
//        }
//
//        int midIdx = (firstIdx + lastIdx) / 2;
//
//        if (arr[midIdx] > key) {
//            return search(arr, key, firstIdx, midIdx - 1);
//        } else if (arr[midIdx] < key) {
//            return search(arr, key, midIdx + 1, lastIdx);
//        } else {
//            return midIdx;
//        }
//    }

    private static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int midIdx;

        while (low <= high) {
            midIdx = (low + high) / 2;

            if (arr[midIdx] > key) {
                high = midIdx - 1;
            } else if (arr[midIdx] < key) {
                low = midIdx + 1;
            } else {
                return midIdx;
            }
        }
        return -1;
    }
}
