package ch13.sec2.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency=new HomeAgency();
        Home home= homeAgency.rent();
        home.turnOnLight();
        home.turnOffLight();

        CarAgency carAgency=new CarAgency();
        Car car= carAgency.rent();
        car.run();
    }
}
