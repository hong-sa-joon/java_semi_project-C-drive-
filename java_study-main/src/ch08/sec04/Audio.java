package ch08.sec04;

public class Audio implements RemoteControl {
    private int volume;//audio의 볼륨

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {

        System.out.println("Audio를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }

    private int memoryvolume;//원래 볼륨을 기억


    // public 접근제한자는 반드시 있어야한다.
    //default는 생략한다.
    @Override
    public void setMute(boolean mute) {
        if (mute){
            //음소거 직전에 기존 볼륨을 저장한다.
            this.memoryvolume=this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음을 해제합니다.");

            //무음이 해제되면 기존의 볼륨으로 되돌려준다.
            setVolume(this.memoryvolume);
        }
    }


}
