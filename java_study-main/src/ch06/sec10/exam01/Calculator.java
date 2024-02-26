package ch06.sec10.exam01;

public class Calculator {
    //static정적필드를 사용할 경우 객체생성을 할 필요가 없다.
    static double pi = 3.13159;

    static int plus(int x, int y){
        return x+y;

    }
    static int minus(int x, int y){
        return x-y;
    }
}
