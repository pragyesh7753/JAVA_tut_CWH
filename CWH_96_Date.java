// Java starts counting of years from 1970
// Java keeps track of time in milliseconds since 1st January 1970
// 1 year = 365 days
// 1 day = 24 hours
// 1 hour = 60 minutes
// 1 minute = 60 seconds
// 1 second = 1000 milliseconds

public class CWH_96_Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365); // It tells the number of years since 1970
    }
}

// 1 minute = 60 * 1000 milliseconds
// 1 hour = 60 * 60 * 1000 milliseconds
// 1 day = 24 * 60 * 60 * 1000 milliseconds
// 1 year = 365 * 24 * 60 * 60 * 1000 milliseconds
// 1 year = 31536000000 milliseconds