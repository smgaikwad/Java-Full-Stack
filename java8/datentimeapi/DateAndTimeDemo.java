package java8.datentimeapi;

import java.time.*;

public class DateAndTimeDemo
{
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());
        System.out.println("Hours: " + time.getHour());
        System.out.println("Minutes: " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());
        System.out.println("miliseconds: " + time.getNano());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.printf("Month: %d, Year: %d, Day: %d, Minutes: %d, Hours: %d, Seconds: %d",
                dateTime.getMonthValue(),dateTime.getYear(),dateTime.getDayOfMonth()
        , dateTime.getMinute(), dateTime.getHour(), dateTime.getSecond());

        System.out.println();
        LocalDateTime dateTime1 = LocalDateTime.of(1998,12,23,12,12,12);
        System.out.println(dateTime1);
        System.out.println(dateTime1.plusMonths(6));
        System.out.println(dateTime1.minusMonths(6));

        LocalDate birthDate = LocalDate.of(1998, 12, 23);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);

        System.out.printf("Years: %d  Months: %d  Days: %d", period.getYears(),period.getMonths(),period.getDays()+"\n");

        Year year = Year.now();
        if (year.isLeap()){
            System.out.println("current year is leap year..");
        }else
            System.out.println("Current year is not a leap year..");



    }
}
