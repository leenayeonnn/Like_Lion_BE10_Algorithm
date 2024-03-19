package com.example.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxScore2 {
    public static void main(String[] args) {
        int[] scores = input();
        System.out.println("max score : " + max(scores));
    }

    public static int[] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("input student num : ");
        int studentNum = sc.nextInt();

        int[] scores = new int[studentNum];

        for (int i = 1; i <= studentNum; i++) {
            System.out.print("input student" + i + " score : ");
            scores[i - 1] = sc.nextInt();
        }

        sc.close();
        return scores;
    }

    private static int max(int[] scores) {
        Arrays.sort(scores);
        return scores[scores.length - 1];
    }
}
