package Level1_practice;
import java.util.*;

public class ques4{
    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] userDefined = getChars(input);
        char[] builtIn = input.toCharArray();
        System.out.println(Arrays.toString(userDefined));
        System.out.println(Arrays.toString(builtIn));
        System.out.println(compareArrays(userDefined, builtIn));
    }
}

