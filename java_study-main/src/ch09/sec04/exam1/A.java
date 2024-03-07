package ch09.sec04.exam1;

public class A {
    //생성자안에 클래스 선언

    A(){
        class B{}
            B b= new B();

    }
    //메소드안에 클래스 선언
    void method(){
        class B{};
        B b = new B();
    }
}
