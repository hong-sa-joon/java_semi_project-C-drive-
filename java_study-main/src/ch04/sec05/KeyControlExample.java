package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        //자동차 속도 출력 하는 기능
        //세가지의 기능 존재 1.증속, 2.감속, 3.중지 => 스캐너를 이용해 입력받음.


        Scanner scanner = new Scanner(System.in);//입력기능
        boolean run = true; //현재 자동차가 달리는 중이지 상태값.
        int speed = 0;//현재 속도


        //무한반복
        while (run) {
            //메뉴생성
            System.out.println("==========================");
            System.out.println("1.증속 | 2. 감속 | 3.중지");
            System.out.println("==========================");

            //스캐너로 값을 입력받음
                System.out.print("선택: ");
                String strNum = scanner.nextLine();//입력받은 값을 저장


            //1.증속: speed를 올림
            if (strNum.equals("1")) {//스트링 타입은 값을 비교할 때 equals를 사용 (==사용X)
                speed++;
                System.out.println("현재속도 =" + speed);
            } else if (strNum.equals("2")) {
                //2.감속: speed를 내림
                speed--;
                System.out.println("현재속도 =" + speed);
            } else {
                //4.중지: 프로그램 종료
                run = false;
            }
        }
            System.out.println("프로그램 종료");


    }
}
