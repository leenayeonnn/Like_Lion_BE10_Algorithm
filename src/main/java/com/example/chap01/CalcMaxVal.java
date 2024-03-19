package com.example.chap01;

public class CalcMaxVal {
    public static void main(String[] args) {
        System.out.println(findMax(1, 2, 3));
    }

    public static int findMax(int val1, int val2, int val3) {
        int max = val1;

        if (max < val2) {
            max = val2;
        }
        if (max < val3) {
            max = val3;
        }

        return max;
    }
}
