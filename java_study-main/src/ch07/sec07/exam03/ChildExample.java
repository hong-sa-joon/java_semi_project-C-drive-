package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        //자동타입변환
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";
//        parent.method3();

        //자식 클래스에 있는 멤버를 사용하기 위해 강제타입변환 진행
        Child child = (Child) parent;

        child.field2="data2";
        child.method3();


        //강제타입변환시 부모클래스에 있는 것도 사용가능
        child.field1="data1";
        child.method2();
        child.method1();













    }
}
