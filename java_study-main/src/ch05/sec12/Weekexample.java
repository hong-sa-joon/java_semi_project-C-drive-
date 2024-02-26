package ch05.sec12;

import java.util.Calendar;

public class Weekexample {
    public static void main(String[] args) {
        //Week 열거타입 변수 선언.
        Week today = null;
        //Week 열거타입 값 가져오기.
        today = Week.MONDAY;

        Calendar cal = Calendar.getInstance();//날짜 정보를 제공해주는 객체
        //오늘의 요일을 숫자로 준다.
        int week = cal.get(Calendar.DAY_OF_WEEK);//일(1) 월(2)~토(7)
        System.out.println(week);//5일을 준다


        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 쉽니다.");
        } else {
            System.out.println("자바 공부를 합니다.");
        }
    }
}
