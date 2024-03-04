package ch11.sec06;


//잔고 부족 예외 클래스, 예외 클래스는 클래스명에 Exception을 붙여주는 것이 바람직 하다
public class InsufficientException extends Exception{
    //생성자
    public InsufficientException() {}
    public InsufficientException(String message) {
        super(message); //예외 메세지로 만들어 주기 위해 -> 예외 객체의 공통 메소드인 getMessage()의 리턴 값으로 사용하기 위해
    }
}