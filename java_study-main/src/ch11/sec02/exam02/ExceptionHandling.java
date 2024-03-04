package ch11.sec02.exam02;

public class ExceptionHandling {
    public static void main(String[] args) {
        //일반예외는 반드시 예외처리 코드(try)를 작성해야 한다.
try {
        Class.forName("java.lang.String");
        System.out.println("java.lang.String 클래스가 존재합니다.");
}catch (ClassNotFoundException e){
    e.printStackTrace();
}
        System.out.println();

try {
    Class.forName("java.lang.String2");
    System.out.println("java.lang.String 클래스가 존재합니다.");
}catch (ClassNotFoundException e){
    e.printStackTrace();
}
    }
}
