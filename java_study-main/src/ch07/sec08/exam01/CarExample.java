package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //필드를 이용해 자동타입변환이 일어난다.
        //Tire tire = new HankookTire()랑 같다
        myCar.tire= new HankookTire();
        //tire.run()이랑 같다.=>오버라이드 된 메소드가 있으면 자식 클래스에 있는 메소드 사용
        myCar.run();


        //Tire tire=new KumhoTire()랑 같다.
        myCar.tire = new KumhoTire();
        //tire.roll()이랑 같다.->오버라이드 된 메소드가 있으면 자식클래스에 있는 메소드 사용
        myCar.run();

        //Tire tire= new Tire()랑 같다.
        myCar.tire=new Tire();

        myCar.run();




    }
}
