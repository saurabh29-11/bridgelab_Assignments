package practiceProblem;

import java.util.Scanner;

public class practiceProblem {
    // 1. Welcome Message
    public static String welcomeMessage() {
        return "Welcome to Bridgelabz!";
    }

    // 2. Add Two Numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 3. Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 4. Area of Circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 5. Volume of Cylinder
    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // 6. Simple Interest
    public static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // 7. Perimeter of Rectangle
    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    // 8. Power Calculation
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 9. Average of Three Numbers
    public static double averageOfThree(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // 10. Kilometers to Miles
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Welcome
        System.out.println(welcomeMessage());

        // 2. Add Two Numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum = " + addNumbers(a, b));

        // 3. Celsius to Fahrenheit
        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));

        // 4. Area of Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area = " + areaOfCircle(r));

        // 5. Volume of Cylinder
        System.out.print("Enter radius of cylinder: ");
        double rad = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();
        System.out.println("Volume = " + volumeOfCylinder(rad, h));

        // 6. Simple Interest
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        System.out.println("Simple Interest = " + simpleInterest(p, rate, t));

        // 7. Perimeter of Rectangle
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Perimeter = " + perimeterOfRectangle(length, width));

        // 8. Power Calculation
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exp = sc.nextDouble();
        System.out.println("Power = " + power(base, exp));

        // 9. Average of Three Numbers
        System.out.print("Enter three numbers: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        System.out.println("Average = " + averageOfThree(n1, n2, n3));

        // 10. Kilometers to Miles
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Miles = " + kmToMiles(km));

        sc.close();
    }
    
}
