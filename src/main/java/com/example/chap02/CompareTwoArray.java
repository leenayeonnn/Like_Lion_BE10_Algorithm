package com.example.chap02;

public class CompareTwoArray {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};

        System.out.println("array1과 array2는 동일한가? " + areArraysEqual(array1, array2));
        System.out.println("array1과 array2는 동일한가? " + areArraysEqual(array1, array3));
    }

    static boolean areArraysEqual(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
