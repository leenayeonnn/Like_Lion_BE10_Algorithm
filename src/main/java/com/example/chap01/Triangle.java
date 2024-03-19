package com.example.chap01;

import java.util.Scanner;

public class Triangle {
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
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
