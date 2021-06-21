package java8.datentimeapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdDemo {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("America/Los_Angeles");
        System.out.println(zone);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);

        System.out.printf("%d : %d : %d",zonedDateTime.getHour(),zonedDateTime.getMinute(),zonedDateTime.getSecond());
    }
}
