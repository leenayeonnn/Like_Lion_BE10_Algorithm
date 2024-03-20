package com.example.chap02;

public class ListPrimeWithList2And3In {
    public static void main(String[] args) {
        findPrime();
    }

    private static void findPrime() {
        boolean isPrime;
        int primeCount = 0;
        int count = 0;

        int[] primes = new int[500];
        primes[primeCount++] = 2;
        primes[primeCount++] = 3;

        for (int num = 5; num < 1000; num += 2) {
            isPrime = true;
            for (int divideIdx = 1; primes[divideIdx] * primes[divideIdx] <= num; divideIdx++) {
                count++;
                if (num % primes[divideIdx] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[primeCount++] = num;
            }
        }

        for (int i = 0; i < primeCount; i++) {
            System.out.println(primes[i]);
        }

        System.out.println("count : " + count);
    }
}
