package com.example.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class MyCircleQueue {
    int tail;
    int head;
    int size;
    int[] queueArr;

    public MyCircleQueue(int size) {
        this.head = -1;
        this.tail = -1;
        this.size = size;
        queueArr = new int[size];
    }

    public void enqueue(int num) {

        if (isFull()) {
            System.out.println("큐가 가득 찼습니다.");
        } else {
            if (isEmpty()) {
                head++;
            }
            tail = (tail + 1) % size;
            queueArr[tail] = num;
        }

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        } else {
            int num = queueArr[head];
            queueArr[head] = 0;

            if (head == tail) {
                head = -1;
                tail = -1;
            } else {
                head = (head + 1) % size;
            }
            return num;
        }
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
            return -1;
        } else {
            return queueArr[head];
        }
    }

    public boolean isEmpty() {
        return (head == -1 && tail == -1);
    }

    private boolean isFull() {
        return (head - tail == 1) || (tail - head == size - 1);
    }

    public void showQueue() {
        System.out.println(Arrays.toString(queueArr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Queue의 사이즈 : ");
        int size = sc.nextInt();

        MyCircleQueue myQueue = new MyCircleQueue(size);

        int choice;
        int num;

        roof:
        while (true) {
            System.out.println("1.Enqueue, 2.Dequeue, 3.peek, 4.isEmpty, 5.exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("넣을 숫자 : ");
                    num = sc.nextInt();
                    myQueue.enqueue(num);
                    break;
                case 2:
                    num = myQueue.dequeue();
                    System.out.println("dequeue " + num);
                    break;
                case 3:
                    num = myQueue.peek();
                    System.out.println("head : " + num);
                    break;
                case 4:
                    if (myQueue.isEmpty()) {
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
            myQueue.showQueue();
        }

        sc.close();
    }
}
