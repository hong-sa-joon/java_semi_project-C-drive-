package ch06.sec11.exam01;

public class Korean {
    //상수 필드 선언

    //첫번째 필드 초기화 방법//선언과 동시에 할당해준다
    final String nation = "대한민국";
    final String ssn;

    //인스턴스 필드
    String name;

    //두번째 상수 필드 초기화 방법
    //매게변수과 필드명이 같을 시 this를 이용
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }


}
