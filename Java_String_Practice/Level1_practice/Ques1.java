package Level1_practice;
import java.util.*;

public class Ques1{
    public static boolean areStringsEqualCharByChar(String str1, String str2) {
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

        System.out.print("Enter the first string: ");
        String firstString = scanner.next();

        System.out.print("Enter the second string: ");
        String secondString = scanner.next();

        boolean customMethodResult = areStringsEqualCharByChar(firstString, secondString);
        boolean builtinMethodResult = firstString.equals(secondString);

        System.out.println("\nResult from custom charAt() method: " + customMethodResult);
        System.out.println("Result from built-in equals() method: " + builtinMethodResult);

        if (customMethodResult == builtinMethodResult) {
            System.out.println("\nBoth methods produced the same result.");
        } else {
            System.out.println("\nWarning: The methods produced different results.");
        }
        
      
    }
}

