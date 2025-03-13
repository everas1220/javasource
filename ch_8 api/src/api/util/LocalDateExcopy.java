package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateExcopy {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2025-03-13T14:37:27.371145500

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2025-03-13
        System.out.println(date.getYear() + "년도 ");
        System.out.println("월 :" + date.getMonthValue());
        System.out.println("일 :" + date.getDayOfMonth());
        System.out.println("+5일" + date.plusDays(5));

        LocalTime time = LocalTime.now();
        System.out.println(time); // 14:39:37.462385100
        System.out.println("시 :" + time.getHour());
        System.out.println("분 :" + time.getMinute());
        System.out.println("초 :" + time.getSecond());
        System.out.println("+5시간" + time.plusHours(5));

    }
}
