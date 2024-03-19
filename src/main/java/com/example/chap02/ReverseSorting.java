package com.example.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSorting {
    public static void main(String[] args) {
        int[] scores = input();

        System.out.println("origin : " + Arrays.toString(scores));
        reverse(scores);
        System.out.println("reverse : " + Arrays.toString(scores));
    }

    public static int[] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("input student num : ");
        int student = sc.nextInt();

        int[] scores = new int[student];

        for (int i = 1; i <= student; i++) {
            System.out.print("input student" + i + " score : ");
            scores[i - 1] = sc.nextInt();
        }

        sc.close();
        return scores;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
    }

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}
