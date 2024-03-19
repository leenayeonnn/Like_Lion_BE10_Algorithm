package com.example.chap01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcPositiveOddSum {
    public static void main(String[] args) {
        int num = input();
        System.out.printf("odd sum (1 ~ %d) = %d", num, oddSum(num));
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            try {
                System.out.print("input positive Integer : ");
                num = sc.nextInt();

                if (num <= 0) {
                    throw new InputMismatchException();
                }

                sc.close();
                return num;

            } catch (InputMismatchException e) {
                System.out.println("Error : input only Positive Integer");
                sc.nextLine();
            }
        }
    }

    private static int oddSum(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

}
