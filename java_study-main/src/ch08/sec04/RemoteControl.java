package ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUME=10;
    int MIN_VOLUME=0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

//default 인스턴스 메소드 작성
    //음소거 기능
    default void setMute(boolean mute){
        if (mute){
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);//볼륨을 0으로 바꿈
        }else {
            System.out.println("무음 해제합니다.");
        }


    }


    //static 메소드 작성
    //public은 생략시 자동으로 컴파일 과정에서 붙는다.
    //private도 가능
    private static void changeBattery(){
        System.out.println("리모콘 건전지를 교환합니다.");
    }

}
