import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class problem4 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 8, 15);
        LocalDate date2 = LocalDate.of(2023, 9, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Date 1: " + date1.format(formatter));
        System.out.println("Date 2: " + date2.format(formatter));

        if (date1.equals(date2)) {
            System.out.println("Both dates are same.");
        } else {
            System.out.println("Dates are different.");
        }
    }
}

