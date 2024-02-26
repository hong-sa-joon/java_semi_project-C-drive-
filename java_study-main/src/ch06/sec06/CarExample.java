package ch06.sec06;

public class CarExample {
    public static void main(String[] args) {

        //설계도(class)를 바탕으로 자동차를 생산한다.

        //첫번째 자동차 생산
        Car myCar = new Car();//자동차 한대 생산

        //필드 값 가져오기
        System.out.println("모델명: " + myCar.modal);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
        System.out.println("제작사: " + myCar.company);
        System.out.println("최대속도: " + myCar.maxSpeed);
        //필드 값 변경
        myCar.speed=60;
        myCar.start=false;
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);


        //메소드 실행
        myCar.run();
        myCar.stop();
    }
}
