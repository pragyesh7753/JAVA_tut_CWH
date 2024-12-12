import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the current date and time
        // System.out.println(dt);

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // This is the format
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df); // Creating date string using date and format
        String myDate2 = dt.format(df2);
        System.out.println(myDate);
        System.out.println(myDate2);
    }
}
