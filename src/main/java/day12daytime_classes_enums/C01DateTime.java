package day12daytime_classes_enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01DateTime {

    public static void main(String[] args) {

        //How to get local date from Java
        LocalDate myDate = LocalDate.now();// Obtains the current date from the system clock in the default time-zone
        System.out.println(myDate);// 2023-07-17

        //How to go future and past
        LocalDate yourDate = myDate.plusMonths(3).plusDays(11).plusYears(5);// Method Chain
        System.out.println(yourDate);// 2028-10-28

        LocalDate ourDate = myDate.minusYears(2).minusMonths(10).minusDays(45);
        System.out.println(ourDate);// 2020-08-03

        //How to format Date
        //Example 1:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf.format(myDate);
        System.out.println(formattedMyDate);// 07/17/2023

        //Example 2:
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String myDateFormatted = dt.format(myDate);
        System.out.println(myDateFormatted);// 17 Jul 2023

        //Example 3:
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd MMMM yy");
        String myDateFormat = d.format(myDate.plusMonths(1));
        System.out.println(myDateFormat);// 17 August 23

        //How to see date in another time zone
        LocalDate dateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInJapan);// 2023-07-18

        //How to get Local Time from Java
        LocalTime myTime = LocalTime.now();// Obtains the current time from the system clock in the default time-zone.
        System.out.println(myTime);// 19:53:06.710462

        //How to go future
        LocalTime yourTime = myTime.plusHours(1).plusMinutes(25).plusSeconds(13);
        System.out.println(yourTime);// 21:18:19.710462

        //How to go past
        LocalTime ourTime = myTime.minusNanos(2000);
        System.out.println(ourTime);// 19:53:06.710460

        //How to format time
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm a");

        String t1 = f1.format(myTime);
        System.out.println(t1);// 07:59 PM

        //How to get time in another time zone
        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(timeInJapan);// 01:04:03.952150

        //How to get date and time together
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);// 2023-07-17T20:06:10.895710

        System.out.println(myDateTime.getMonthValue());//7

        System.out.println(myDateTime.getMonth());//JULY

        System.out.println(myDateTime.getDayOfWeek());//MONDAY

        //Example 4: If the given date is before the current date give message to user like "Invalid date"
        //           If the given date equals the current date give message to user like "Give the time"
        //           If the time is before current time tell to user "No ticket" otherwise tell to user "There is just 1 ticket"
        //           If the given date is after the current date give message to user like "Buy the ticket"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year, month, and day values");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        System.out.println("Enter hours and minutes for the time");
        int hour = input.nextInt();
        int minute = input.nextInt();

        LocalDate currentDate = LocalDate.now();
        LocalDate givenDate = LocalDate.of(year, month, day);

        LocalTime currentTime = LocalTime.now();
        LocalTime givenTime = LocalTime.of(hour,minute);

        if(givenDate.isBefore(currentDate)){
            System.out.println("Invalid date");
        }else if(givenDate.isEqual(currentDate)){

            if(givenTime.isBefore(currentTime)){
                System.out.println("No ticket");
            }else{
                System.out.println("There is just 1 ticket");
            }

        }else if(givenDate.isAfter(currentDate)){
            System.out.println("Buy the ticket");
        }

    }

}
