package com.example.chap02;

import java.util.Scanner;

public class RadixConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; // 변환할 10진수 정수
        int radix; // 변환할 기수
        int digitNum; // 변환 후 자릿수
        int retry; // 반복 여부
        char[] result = new char[32]; // 변환 결과를 저장할 배열

        System.out.println("10진수를 다른 기수로 변환합니다.");
        do {
            do {
                System.out.print("변환할 정수(0 이상): ");
                number = input.nextInt();
            } while (number < 0);
            do {
                System.out.print("변환할 기수(2~36): ");
                radix = input.nextInt();
            } while (radix < 2 || radix > 36);

            digitNum = convertToRadix(number, radix, result);

            System.out.print(radix + "진수로는 ");
            for (int i = 0; i < digitNum; i++)
                System.out.print(result[i]);
            System.out.println(" 입니다.");

            System.out.print("한 번 더 할까요? (1.예 / 0.아니오): ");
            retry = input.nextInt();
        } while (retry == 1);
    }

    private static int convertToRadix(int number, int radix, char[] result) {
        String digitChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int idx = 0;
        do {
            result[idx++] = digitChars.charAt(number % radix);
            number /= radix;
        } while (number > 0);

        reverse(idx, result);

        return idx;
    }

    private static void reverse(int idx, char[] result) {
        char temp;
        for (int i = 0; i < idx / 2; i++) {
            temp = result[i];
            result[i] = result[idx - i - 1];
            result[idx - i - 1] = temp;
        }
    }
}
