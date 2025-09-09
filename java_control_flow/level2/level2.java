package java_control_flow.level2;

public class level2 {
      public static String findOddEvenNumbers(int limit) {
        StringBuilder result = new StringBuilder();
        for (int currentNumber = 1; currentNumber <= limit; currentNumber++) {
            if (currentNumber % 2 == 0) {
                result.append(currentNumber).append(" is Even\n");
            } else {
                result.append(currentNumber).append(" is Odd\n");
            }
        }
        return result.toString();
    }

    // 2. Calculate employee bonus based on years of service
    public static double calculateEmployeeBonus(double employeeSalary, int yearsOfService) {
        double bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = employeeSalary * 0.05;
        }
        return bonusAmount;
    }

    // 3. Generate multiplication table of a number from 6 to 9
    public static String generateMultiplicationTable(int inputNumber) {
        StringBuilder tableResult = new StringBuilder();
        for (int multiplier = 6; multiplier <= 9; multiplier++) {
            tableResult.append(inputNumber)
                       .append(" * ")
                       .append(multiplier)
                       .append(" = ")
                       .append(inputNumber * multiplier)
                       .append("\n");
        }
        return tableResult.toString();
    }

    // 4. FizzBuzz using for loop
    public static String fizzBuzzUsingForLoop(int maxNumber) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.append("FizzBuzz\n");
            } else if (i % 3 == 0) {
                output.append("Fizz\n");
            } else if (i % 5 == 0) {
                output.append("Buzz\n");
            } else {
                output.append(i).append("\n");
            }
        }
        return output.toString();
    }

    // 5. FizzBuzz using while loop
    public static String fizzBuzzUsingWhileLoop(int maxNumber) {
        StringBuilder output = new StringBuilder();
        int currentNumber = 1;
        while (currentNumber <= maxNumber) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                output.append("FizzBuzz\n");
            } else if (currentNumber % 3 == 0) {
                output.append("Fizz\n");
            } else if (currentNumber % 5 == 0) {
                output.append("Buzz\n");
            } else {
                output.append(currentNumber).append("\n");
            }
            currentNumber++;
        }
        return output.toString();
    }

    // 6. Find youngest and tallest among friends
    public static String findYoungestAndTallest(int amarAge, int akbarAge, int anthonyAge,
                                                double amarHeight, double akbarHeight, double anthonyHeight) {
        String youngestFriend;
        String tallestFriend;

        // Youngest friend check
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge < anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Tallest friend check
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight > anthonyHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        return "Youngest: " + youngestFriend + ", Tallest: " + tallestFriend;
    }

    // 7. Find factors of a number using for loop
    public static String findFactorsUsingForLoop(int inputNumber) {
        StringBuilder factorsList = new StringBuilder();
        for (int possibleFactor = 1; possibleFactor < inputNumber; possibleFactor++) {
            if (inputNumber % possibleFactor == 0) {
                factorsList.append(possibleFactor).append(" ");
            }
        }
        return factorsList.toString();
    }

    // 8. Find factors of a number using while loop
    public static String findFactorsUsingWhileLoop(int inputNumber) {
        StringBuilder factorsList = new StringBuilder();
        int factorCandidate = 1;
        while (factorCandidate < inputNumber) {
            if (inputNumber % factorCandidate == 0) {
                factorsList.append(factorCandidate).append(" ");
            }
            factorCandidate++;
        }
        return factorsList.toString();
    }

    // 9. Greatest factor using for loop
    public static int greatestFactorUsingForLoop(int inputNumber) {
        int greatestFactor = 1;
        for (int i = inputNumber - 1; i >= 1; i--) {
            if (inputNumber % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        return greatestFactor;
    }

    // 10. Greatest factor using while loop
    public static int greatestFactorUsingWhileLoop(int inputNumber) {
        int factorCandidate = inputNumber - 1;
        int greatestFactor = 1;
        while (factorCandidate >= 1) {
            if (inputNumber % factorCandidate == 0) {
                greatestFactor = factorCandidate;
                break;
            }
            factorCandidate--;
        }
        return greatestFactor;
    }

    // 11. Multiples below 100 using for loop
    public static String multiplesBelow100ForLoop(int baseNumber) {
        StringBuilder multiplesList = new StringBuilder();
        for (int current = 100; current >= 1; current--) {
            if (current % baseNumber == 0) {
                multiplesList.append(current).append(" ");
            }
        }
        return multiplesList.toString();
    }

    // 12. Multiples below 100 using while loop
    public static String multiplesBelow100WhileLoop(int baseNumber) {
        StringBuilder multiplesList = new StringBuilder();
        int current = 100;
        while (current >= 1) {
            if (current % baseNumber == 0) {
                multiplesList.append(current).append(" ");
            }
            current--;
        }
        return multiplesList.toString();
    }

    // 13. Power calculation using for loop
    public static int calculatePowerForLoop(int baseNumber, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= baseNumber;
        }
        return result;
    }

    // 14. Power calculation using while loop
    public static int calculatePowerWhileLoop(int baseNumber, int exponent) {
        int result = 1;
        int counter = 0;
        while (counter < exponent) {
            result *= baseNumber;
            counter++;
        }
        return result;
    }

    // Main method for small testing
    public static void main(String[] args) {
        System.out.println(findOddEvenNumbers(10));
        System.out.println("Bonus: " + calculateEmployeeBonus(50000, 6));
        System.out.println(generateMultiplicationTable(7));
        System.out.println(fizzBuzzUsingForLoop(15));
        System.out.println(fizzBuzzUsingWhileLoop(15));
        System.out.println(findYoungestAndTallest(21, 19, 22, 5.5, 6.1, 5.9));
        System.out.println(findFactorsUsingForLoop(12));
        System.out.println(findFactorsUsingWhileLoop(12));
        System.out.println("Greatest Factor (for): " + greatestFactorUsingForLoop(28));
        System.out.println("Greatest Factor (while): " + greatestFactorUsingWhileLoop(28));
        System.out.println(multiplesBelow100ForLoop(7));
        System.out.println(multiplesBelow100WhileLoop(7));
        System.out.println("Power (for): " + calculatePowerForLoop(2, 5));
        System.out.println("Power (while): " + calculatePowerWhileLoop(2, 5));
    }
    
}
