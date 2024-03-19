package com.example.chap01;

import java.util.Scanner;

public class Triangle2 {

    public static void main(String[] args) {
        printTriangle(input());
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input num : ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static void printTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            printLefTriangle(num, i);
            printRightTriangle(i);
            System.out.println();
        }
    }

    public static void printLefTriangle(int num, int i) {
        for (int j = num; j > 0; j--) {
            if (j > i) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }

    public static void printRightTriangle(int i) {
        for (int j = 1; j < i; j++) {
            System.out.print("*");
        }
    }

}
