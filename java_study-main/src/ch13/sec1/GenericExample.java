package ch13.sec1;

import ch08.sec10.exam01.B;

public class GenericExample {
    public static void main(String[] args) {
        //제네릭: 아직 정해지지 않은 타입에 대해 그때그때 다르게 정의가능
        Box<String> box = new Box<String>();
        box.content = "안녕하세요";
        box.content = "문자열";
        String content = box.content;
        //box.content = 1;//Integer타입
        //box.content = new Bottle();
        //String content=box.content;
        //에러발생
        //Object content=box.content;를 하거나
        //String content=(String)box.content;강제타입변환을 해준다.
        //Object에 어떤 내용물이 저장되어 있는지
        //모른다면 모든 클래스를 조사하는 건 한계가 있다


        Box<Integer> box1 = new Box<Integer>();
        box1.content=10;
        int content1=box1.content;
        System.out.println(content1);
        //기본타입 사용불가 포장타입으로 사용가능

    }
}
