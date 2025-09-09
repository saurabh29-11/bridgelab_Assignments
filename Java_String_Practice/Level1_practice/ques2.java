package Level1_practice;

import java.util.Scanner;

public class ques2 {

    public static String getSubstr(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean areEqual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = scanner.next();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid indices. Please ensure 0 <= start <= end <= string length.");
            scanner.close();
            return;
        }

        String customSub = getSubstr(text, start, end);
        String builtinSub = text.substring(start, end);

        System.out.println("\nCustom Substring (using charAt): " + customSub);
        System.out.println("Built-in Substring: " + builtinSub);

        boolean result = areEqual(customSub, builtinSub);

        if (result) {
            System.out.println("\nResult: The two substrings are identical.");
        } else {
            System.out.println("\nResult: The two substrings are different.");
        }

        scanner.close();
    }
}

