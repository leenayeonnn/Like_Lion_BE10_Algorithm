package com.example.chap01;

import java.util.Scanner;

public class Triangle3 {

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
            printBlank(num, i);
            printStar(i);
            System.out.println();
        }
    }

    public static void printBlank(int num, int i) {
        for (int j = 0; j < num - i; j++) {
            System.out.print(" ");
        }
    }

    public static void printStar(int i) {
        for (int j = 0; j < i * 2 - 1; j++) {
            System.out.print("*");
        }
    }

}
