package Level1_practice;

import java.util.*;

public class ques6{
    public static void generateIllegalArgument(String s) {
        System.out.println(s.substring(5, 2)); 
    }

    public static void handleIllegalArgument(String s) {
        try {
            System.out.println(s.substring(5, 2)); 
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        generateIllegalArgument(input);    
        handleIllegalArgument(input);     
    }
}
