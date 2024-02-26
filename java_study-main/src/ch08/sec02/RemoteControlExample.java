package ch08.sec02;

import ch06.sec13.exan02.pakege1.A;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc=new Television();
        rc.turnOn();

        RemoteControl rc2= new Audio();
        rc2.turnOn();

        System.out.println("리모콘 최대 볼륨: "+RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최저 볼륨: "+RemoteControl.MIN_VOLUME);
    }
}
