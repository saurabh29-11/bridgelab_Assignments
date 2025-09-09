package level2_Builtin;

import java.util.Random;
import java.util.Scanner;

public class level2 {
    static Scanner input = new Scanner(System.in);

    // ---------- Problem 1: Number Guessing Game ----------
    static int playGame(int low, int high) {
        Random random = new Random();
        String feedback = "";
        while (!feedback.equals("correct")) {
            int guess = random.nextInt(high - low + 1) + low;
            System.out.print("Is your number " + guess + "? (high/low/correct): ");
            feedback = input.next().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                return guess;
            }
        }
        return -1;
    }

    // ---------- Problem 2: Maximum of Three ----------
    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // ---------- Problem 3: Prime Checker ----------
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ---------- Problem 4: Fibonacci ----------
    static int[] generateFibonacci(int terms) {
        int[] series = new int[terms];
        if (terms > 0) series[0] = 0;
        if (terms > 1) series[1] = 1;

        for (int i = 2; i < terms; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }

    // ---------- Problem 5: Palindrome ----------
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // ---------- Problem 6: Factorial ----------
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // ---------- Problem 7: GCD ----------
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // ---------- Problem 7: LCM ----------
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // ---------- Problem 8: Temperature Converter ----------
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // ---------- Problem 9: Calculator ----------
    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static double divide(int a, int b) { return (double)a / b; }

    // ---------- Main (Only Calls) ----------
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Think of a number between 1 and 100!");
        int guessed = playGame(1, 100);
        System.out.println("Guessed Number = " + guessed);

        // Problem 2
        int max = findMax(10, 20, 15);
        System.out.println("Maximum = " + max);

        // Problem 3
        boolean primeCheck = isPrime(29);
        System.out.println("29 is prime? " + primeCheck);

        // Problem 4
        int[] fib = generateFibonacci(7);
        System.out.print("Fibonacci: ");
        for (int val : fib) System.out.print(val + " ");
        System.out.println();

        // Problem 5
        boolean palindrome = isPalindrome("level");
        System.out.println("Is 'level' palindrome? " + palindrome);

        // Problem 6
        int fact = factorial(5);
        System.out.println("Factorial of 5 = " + fact);

        // Problem 7
        int gcdVal = gcd(54, 24);
        int lcmVal = lcm(54, 24);
        System.out.println("GCD = " + gcdVal + ", LCM = " + lcmVal);

        // Problem 8
        double celsius = toCelsius(98.6);
        double fahrenheit = toFahrenheit(37);
        System.out.println("98.6F in Celsius = " + celsius);
        System.out.println("37C in Fahrenheit = " + fahrenheit);

        // Problem 9
        System.out.println("10 + 5 = " + add(10, 5));
        System.out.println("10 - 5 = " + subtract(10, 5));
        System.out.println("10 * 5 = " + multiply(10, 5));
        System.out.println("10 / 5 = " + divide(10, 5));
    }
    
    
}
