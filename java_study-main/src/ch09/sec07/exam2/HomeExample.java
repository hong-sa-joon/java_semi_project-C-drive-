package ch09.sec07.exam2;

public class HomeExample {
    public static void main(String[] args) {
        Home home=new Home();
        home.use();
        home.use2();
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio를 끕니다");
            }
        });
    }
}
