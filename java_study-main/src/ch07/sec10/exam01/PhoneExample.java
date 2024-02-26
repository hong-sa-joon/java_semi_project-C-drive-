package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //abstract 클래스는 객체 생성x
        //Phone phone=new Phone();


        SmartPhone smartPhone = new SmartPhone("길동");
        smartPhone.turnOn();//Phone의 메소드
        smartPhone.internetSearch();//SmarPhone의 메소드
        smartPhone.turnOff();// Phone의 메소드
    }
}
