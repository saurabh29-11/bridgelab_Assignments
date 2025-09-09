package java_control_flow.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class level1 {
    
    // 1. Check if a number is divisible by 5
    public static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    // 2. Check if first number is smallest among three
    public static boolean isFirstSmallest(int number1, int number2, int number3) {
        return number1 < number2 && number1 < number3;
    }

    // 3. Check which number is largest
    public static boolean isFirstLargest(int number1, int number2, int number3) {
        return number1 > number2 && number1 > number3;
    }

    public static boolean isSecondLargest(int number1, int number2, int number3) {
        return number2 > number1 && number2 > number3;
    }

    public static boolean isThirdLargest(int number1, int number2, int number3) {
        return number3 > number1 && number3 > number2;
    }

    // 4. Sum of n natural numbers using formula
    public static int sumOfNaturalNumbers(int number) {
        if (number > 0) {
            return number * (number + 1) / 2;
        } else {
            return -1; // invalid (not natural)
        }
    }

    // 5. Check if person can vote
    public static boolean canVote(int age) {
        return age >= 18;
    }

    // 6. Check number is positive, negative or zero
    public static String checkNumberSign(int number) {
        if (number > 0) return "Positive";
        else if (number < 0) return "Negative";
        else return "Zero";
    }

    // 7. Check if date is in Spring Season (March 20 to June 20)
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    // 8. Countdown using while loop
    public static List<Integer> countdownWhile(int start) {
        List<Integer> countdownList = new ArrayList<>();
        int counter = start;
        while (counter >= 1) {
            countdownList.add(counter);
            counter--;
        }
        return countdownList;
    }

    // 9. Countdown using for loop
    public static List<Integer> countdownFor(int start) {
        List<Integer> countdownList = new ArrayList<>();
        for (int counter = start; counter >= 1; counter--) {
            countdownList.add(counter);
        }
        return countdownList;
    }

    // 10. Sum until user enters 0
    public static double sumUntilZero(List<Double> numbers) {
        double total = 0.0;
        for (double num : numbers) {
            if (num == 0) break;
            total += num;
        }
        return total;
    }

    // 11. Sum until user enters 0 or negative
    public static double sumUntilZeroOrNegative(List<Double> numbers) {
        double total = 0.0;
        for (double num : numbers) {
            if (num <= 0) break;
            total += num;
        }
        return total;
    }

    // 12. Sum of n natural numbers using while loop
    public static int sumNaturalWhile(int number) {
        if (number <= 0) return -1;
        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }
        return sum;
    }

    // 13. Sum of n natural numbers using for loop
    public static int sumNaturalFor(int number) {
        if (number <= 0) return -1;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    // 14. Factorial using while loop
    public static long factorialWhile(int number) {
        if (number < 0) return -1;
        long fact = 1;
        int i = 1;
        while (i <= number) {
            fact *= i;
            i++;
        }
        return fact;
    }

    // 15. Factorial using for loop
    public static long factorialFor(int number) {
        if (number < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    // 16. Odd and Even numbers up to n
    public static Map<String, List<Integer>> oddEvenNumbers(int number) {
        Map<String, List<Integer>> result = new HashMap<>();
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        result.put("Odd", oddList);
        result.put("Even", evenList);
        return result;
    }

    // 17. Bonus calculation
    public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return 0.0;
        }
    }

    // 18. Multiplication table (6 to 9)
    public static List<String> multiplicationTable(int number) {
        List<String> table = new ArrayList<>();
        for (int i = 6; i <= 9; i++) {
            table.add(number + " * " + i + " = " + (number * i));
        }
        return table;
    }

    // Main function for testing (optional)
    public static void main(String[] args) {
        // Example test calls
        System.out.println("Divisible by 5 (10): " + isDivisibleByFive(10));
        System.out.println("First is smallest (3,5,7): " + isFirstSmallest(3,5,7));
        System.out.println("Factorial (5): " + factorialFor(5));
        System.out.println("OddEven (10): " + oddEvenNumbers(10));
    }
    
}
