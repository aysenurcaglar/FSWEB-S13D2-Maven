package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        if (number < 0)
            number *= -1;

        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverseNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0)
            return false;

        int sum = 0;

        for (int i = 1; i <= number / 2; i++)
            if (number % i == 0) {
                sum += i;
            }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder result = new StringBuilder();
        int tempNumber = number;
        int digitCount = 0;

        while (tempNumber > 0) {
            tempNumber /= 10;
            digitCount++;
        }

        tempNumber = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            int digit = tempNumber / (int) Math.pow(10, i);
            tempNumber %= (int) Math.pow(10, i);
            StringBuilder append = result.append(words[digit]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
