package com.example.chap02;

import java.util.Scanner;

public class ListPrime {
    public static void main(String[] args) {
        findPrime();
    }

    private static void findPrime() {
        boolean isPrime;
        int count = 0;

        for (int num = 2; num <= 1000; num++) {
            isPrime = true;
            for (int divide = 2; divide < num; divide++) {
                count++;
                if (num % divide == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
        System.out.println("count : " + count);
    }
}
