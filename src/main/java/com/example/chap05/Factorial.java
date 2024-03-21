package com.example.chap05;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        while (true) {
            System.out.print("숫자 입력 (0 입력시 종료) : ");
            num = sc.nextInt();

            if (num == 0)
                break;

            System.out.println(num + "! = " + Factorial.calc(num));
        }

        sc.close();
    }

    static int calc(int n) {
        if (n > 0) {
            return n * calc(n - 1);
        }

        return 1;
    }

    static int calcWithWhile(int n) {
        int result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}