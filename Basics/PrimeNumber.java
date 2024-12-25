package Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean result = isPrime(number);
        if (result)
            System.out.println(number + " is prime");
        else
            System.out.println(number + " is not prime");
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}