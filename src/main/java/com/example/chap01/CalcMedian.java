package com.example.chap01;

public class CalcMedian {
    public static void main(String[] args) {

    }

    public static int findMedian(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                return b;
            }

            return Math.min(a, c);
        }

        if (a > c) {
            return a;
        }

        return Math.min(b, c);
    }
}
