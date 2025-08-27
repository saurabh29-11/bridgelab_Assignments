import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class problem2 {

    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Original Date: " + initialDate.format(formatter));

        LocalDate modifiedDate = initialDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate.format(formatter));

        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));
    }
}