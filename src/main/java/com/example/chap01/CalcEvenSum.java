package com.example.chap01;

import java.util.Scanner;

public class CalcEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input integer : ");
        int num = sc.nextInt();

        System.out.printf("even sum (1 ~ %d) = %d", num, evenSum(num));

        sc.close();
    }

    public static int evenSum(int num) {
        int sum = 0;

        if (num >= 1) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;
        }

        for (int i = 1; i >= num; i--) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
