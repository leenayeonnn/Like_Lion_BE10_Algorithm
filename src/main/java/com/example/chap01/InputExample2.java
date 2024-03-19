package com.example.chap01;

public class InputExample2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(num);

        String text = args[1];
        System.out.println(text);

        boolean flag = Boolean.parseBoolean(args[2]);
        System.out.println(flag);
    }
}
