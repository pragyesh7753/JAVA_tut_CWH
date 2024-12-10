
// import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// GregorianCalendar is a concrete subclass of Calendar and provides the standard calendar system used by most of the world.
public class CWH_99_GregorianCalendar_Class {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getTime());
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " +
        // c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
        System.out.println(cal.isLeapYear(2021));

        // GMT stands for Greenwich Mean Time and is the time standard against which all
        // other time zones in the world are referenced.
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }

}
