
// Calendar class in Java is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.
// GregorianCalendar is a concrete subclass of Calendar and provides the standard calendar system used by most of the world.

import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_Calendar_Class {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTime());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getTimeZone().getID());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
