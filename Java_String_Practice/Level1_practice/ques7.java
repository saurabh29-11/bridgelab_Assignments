package Level1_practice;
import java.util.*;

public class ques7{
    public static void generateNumberFormat(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    public static void handleNumberFormat(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        generateNumberFormat(input);    
        handleNumberFormat(input);     
    }
}

