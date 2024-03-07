package ch09.sec07.exam2;

public class Home {
    private RemoteControl remoteControl=new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Tv를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv를 끕니다");
        }
    };
    public void use(){
        remoteControl.turnOn();
        remoteControl.turnOff();
    }

    public void use2(){
        RemoteControl remoteControl1=new RemoteControl() {//에어컨클래스
            @Override
            public void turnOn() {
                System.out.println("에어컨이 켜집니다");
            }

            @Override
            public void turnOff() {

                System.out.println("에어컨이 꺼집니다");
            }
        };
remoteControl1.turnOn();
remoteControl1.turnOff();
    }
    public void use3(RemoteControl remoteControl){
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
