package ch07.sec10.exam02;

public abstract class Animal {
    //일반 메소드 구현
    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }
    //추상메소드(abstract)메소드 구현=>선언부만있음
    //오버라이드용으로 사용
    public abstract void sound();



}
