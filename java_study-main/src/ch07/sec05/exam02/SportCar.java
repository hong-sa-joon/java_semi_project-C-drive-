package ch07.sec05.exam02;

public class SportCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // final 메소드는 자식 클래스에서 재정의(오버라이딩)할 수 없다.
    /*
    @Override
    public final void stop() {
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
     */

}
