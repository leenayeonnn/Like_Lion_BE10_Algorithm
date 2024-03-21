package com.example.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class MyStack {
    int top;
    int size;
    int[] stackArr;

    public MyStack(int size) {
        this.top = -1;
        this.size = size;
        stackArr = new int[size];
    }

    public void push(int num) {
        if (!isFull()) {
            stackArr[++top] = num;
        } else {
            System.out.println("스택이 가득 찼습니다.");
        }
    }

    private boolean isFull() {
        return top == size - 1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다.");
            return -1;
        } else {
            return stackArr[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다.");
            return -1;
        } else {
            return stackArr[top];
        }
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void showStack() {
        System.out.println(Arrays.toString(stackArr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Stack의 사이즈 : ");
        int size = sc.nextInt();

        MyStack myStack = new MyStack(size);

        int choice;
        int num;

        roof:
        while (true) {
            System.out.println("1.push, 2.pop, 3.peek, 4.isEmpty, 5.exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("넣을 숫자 : ");
                    num = sc.nextInt();
                    myStack.push(num);
                    break;
                case 2:
                    num = myStack.pop();
                    System.out.println("pop " + num);
                    break;
                case 3:
                    num = myStack.peek();
                    System.out.println("top : " + num);
                    break;
                case 4:
                    if (myStack.isEmpty()) {
                        System.out.println("스택이 비었습니다.");
                    } else {
                        System.out.println("스택에 데이터가 있습니다.");
                    }
                    break;
                case 5:
                    break roof;
                default:
                    System.out.println("잘못된 입력");
            }
            myStack.showStack();
        }

        sc.close();
    }
}
