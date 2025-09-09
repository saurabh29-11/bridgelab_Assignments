package Level1_practice;
import java.util.*;

public class  ques5{
    public static void generateException(String s) {
        System.out.println(s.charAt(s.length())); 
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        generateException(input);
        handleException(input);
    }
}

