package ch08.sec10.exam02;

import ch08.sec10.exam01.B;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();//자동타입변환
        vehicle.run();

        //자식 클래스 메소드를 호출하기 위해 장제타입변환
        Bus bus=(Bus)vehicle;
        bus.run();
        bus.checkFare();




    }
}
