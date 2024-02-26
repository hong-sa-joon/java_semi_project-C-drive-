package ch02.sec13;

import java.util.Scanner;//이게 있어야 Scanner를 사용가능하다

public class ScannerExample {
    public static void main(String[] args) {
//        1. Scanner 객체 생성
        //자바에서 객체 생성시에는 new라는 키워드를 사용해 객체 생성
        //참조타입 변수명 = new객체
        Scanner scanner = new Scanner(System.in);
//      타입      변수      객체생성(생성시에 타입과 동일한 이름)


        System.out.print("X값 입력:");
        //2. scanner에서 값 입력받기
        String strX = scanner.nextLine();
        System.out.println("내가 입력한 X값:" + strX);
        System.out.println("Y값 입력:");
        String strY = scanner.nextLine();

        int result = Integer.parseInt(strX) + Integer.parseInt(strY);
        System.out.println("X+Y=" + result);
        //계속 입력을 받을 수 있게 만들고 q를 입력했을 때 프로그램이 끝나도록 만들기
        //true를 주면 끊지않고 계속 입력된다
        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();

            //data의 입력된 값이 q인지?
            if (data.equals("q")) {
                break;//while문 중단
            }
            System.out.println("출력 문자열:" + data);
        }
        //while문 탈출 후 찍는 문자
        System.out.println("프로그램 종료");
    }
}
