package com.example.chap05;

import java.util.Scanner;

public class FactorialWithTailRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        while (true) {
            System.out.print("숫자 입력 (0 입력시 종료) : ");
            num = sc.nextInt();

            if (num == 0)
                break;

            System.out.println(num + "! = " + FactorialWithTailRecursive.calc(num, 1));
        }

        sc.close();
    }

    static int calc(int n, int accumulator) {
        if (n > 0) {
            return calc(n - 1, accumulator * n);
        }

        return accumulator;
    }
}
