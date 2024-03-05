package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime now= LocalDateTime.now();//현재 날짜 시간
        DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println(now.format(dft));

        LocalDateTime startDateTime = LocalDateTime.of(2021,1,1,0,0,0);
        System.out.println("시작일: "+startDateTime.format(dft));
        LocalDateTime endDateTime = LocalDateTime.of(2021,12,31,0,0,0);
        System.out.println("종료일: "+endDateTime.format(dft));

        if (startDateTime.isBefore(endDateTime)){
            //isBefore=startDateTime보다endDateTime의 날짜보다 전인가
            System.out.println("진행중입니다");
        }else if (startDateTime.equals(endDateTime)){//endDteTime과 같다면
            System.out.println("종료합니다.");
        } else if (startDateTime.isAfter(endDateTime)) {//endDteTime 이후라면
            System.out.println("종료했습니다");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);

        System.out.println("남은 해"+remainYear);
        System.out.println("남은 월"+remainMonth);
        System.out.println("남은 일"+remainDay);
        System.out.println("남은 시간"+remainHour);
        System.out.println("남은 분"+remainMinute);
        System.out.println("남은 초"+remainSecond);


    }
}
