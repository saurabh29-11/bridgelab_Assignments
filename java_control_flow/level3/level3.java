package java_control_flow.level3;

public class level3 {
     // 1. Leap Year check with multiple if-else
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Not valid in Gregorian calendar
        }
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    // 2. Leap Year check with single if + logical operators
    public static boolean isLeapYearLogical(int year) {
        return (year >= 1582) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    // 3. Calculate percentage and grade
    public static String calculateGrade(int physicsMarks, int chemistryMarks, int mathsMarks) {
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double average = totalMarks / 3.0;
        String grade;

        if (average >= 90) {
            grade = "A (Excellent)";
        } else if (average >= 75) {
            grade = "B (Good)";
        } else if (average >= 50) {
            grade = "C (Average)";
        } else {
            grade = "D (Poor)";
        }

        return "Average: " + average + ", Grade: " + grade;
    }

    // 4. Prime number check
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 5. Armstrong number check
    public static boolean isArmstrong(int number) {
        int original = number;
        int sumOfCubes = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfCubes += Math.pow(digit, 3);
            number /= 10;
        }
        return sumOfCubes == original;
    }

    // 6. Count digits of a number
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) return 1;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    // 7. BMI calculator
    public static String calculateBMI(double weightKg, double heightCm) {
        double heightMeters = heightCm / 100.0;
        double bmi = weightKg / (heightMeters * heightMeters);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return "BMI: " + bmi + ", Status: " + status;
    }

    // 8. Harshad number check
    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = 0, temp = number;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        return number % sumOfDigits == 0;
    }

    // 9. Abundant number check
    public static boolean isAbundantNumber(int number) {
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sumOfDivisors += i;
        }
        return sumOfDivisors > number;
    }

    // 10. Calculator using switch-case
    public static double calculator(double first, double second, String operator) {
        switch (operator) {
            case "+": return first + second;
            case "-": return first - second;
            case "*": return first * second;
            case "/": return second != 0 ? first / second : Double.NaN;
            default: return Double.NaN;
        }
    }

    // 11. Day of Week (Zeller's Congruence)
    public static int dayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int k = year % 100;
        int j = year / 100;
        int result = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        // Zeller’s formula returns 0=Saturday … 6=Friday. Adjusting to 0=Sunday … 6=Saturday
        return (result + 6) % 7;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("Leap Year 2000: " + isLeapYear(2000));
        System.out.println("Leap Year 1900: " + isLeapYearLogical(1900));
        System.out.println(calculateGrade(90, 80, 85));
        System.out.println("Prime 29: " + isPrime(29));
        System.out.println("Armstrong 153: " + isArmstrong(153));
        System.out.println("Digits in 12345: " + countDigits(12345));
        System.out.println(calculateBMI(70, 175));
        System.out.println("Harshad 21: " + isHarshadNumber(21));
        System.out.println("Abundant 12: " + isAbundantNumber(12));
        System.out.println("Calc 5*3: " + calculator(5, 3, "*"));
        System.out.println("Day of Week (9 Sept 2025): " + dayOfWeek(9, 9, 2025));
    }
    
}
