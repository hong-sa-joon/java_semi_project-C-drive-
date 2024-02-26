package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        //다오타입 변환
        Parent parent = child;


        //메소드호출
        //자동타입 변환이 일어나면 부모 ㅋㄹ래스에 있는 필드와 메소드만 사용가능
        //단, 오버라이드된 메소드는 예외적으로 자식 클래스에 있는 것을 사용
        parent.method1();//부모 클래스 메소드
        parent.method2();//오버라이딩된 메소드
        //parent.method3();

        parent.field1 = 2;
//        parent.field2 = 2;
    }
}
