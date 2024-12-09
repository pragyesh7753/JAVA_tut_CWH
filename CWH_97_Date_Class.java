import java.util.Date; // Date class is present in java.util package and its most methods are deprecated after Java 8

public class CWH_97_Date_Class {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE); // 9223372036854775807
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        // System.out.println(d.getDate()); // Deprecated
        // System.out.println(d.getDay()); // Deprecated
        // System.out.println(d.getHours()); // Deprecated
        // System.out.println(d.getMinutes()); // Deprecated
        // System.out.println(d.getMonth()); // Deprecated
        // System.out.println(d.getSeconds()); // Deprecated
        System.out.println(d.clone());
    }
}
