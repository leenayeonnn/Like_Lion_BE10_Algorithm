package com.example.chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindRandomMax {
    public static void main(String[] args) {
        int num = input();
        int[] weights = makeRandomWeights(num);
        System.out.println("몸무게 list : " + Arrays.toString(weights));
        System.out.println("max : " + max(weights));
    }

    private static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input person num : ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    private static int[] makeRandomWeights(int num) {
        Random random = new Random();
        int[] weights = new int[num];

        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextInt(60) + 40;
        }
        return weights;
    }

    static int max(int[] weights) {
        Arrays.sort(weights);
        return weights[weights.length - 1];
    }
}
