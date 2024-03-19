package com.example.chap02;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 29;

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            decimal /= 2;
            binary.append(remainder);
        }

        System.out.println(binary.reverse().toString());

    }
}
