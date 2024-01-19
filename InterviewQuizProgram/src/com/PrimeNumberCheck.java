package com;

import java.util.stream.IntStream;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(49)); // false
        System.out.println(" Is Prime No : " + isPrimeByJava8(7));
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeByJava8(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        boolean isPrime = IntStream.rangeClosed(2, n / 2).noneMatch(x -> n % 2 == 0);

        return isPrime;
    }
}
