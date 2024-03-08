package ch15.sec2.exam1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 정의 방법
        //E에 지정된 타입 객체만 저장
        List<Board> list = new ArrayList<Board>();//제네릭< ? >을사용하면 형변환을 하지 않아도 된다.
        List<Board> list1 = new ArrayList<>();
        list.add(new Board("제목", "내용1", "글쓴이1"));
        list.add(new Board("제목", "내용2", "글쓴이2"));
        list.add(new Board("제목", "내용3", "글쓴이3"));

        Board board = list.get(2);
        System.out.println(board.getSubject() + " " + board.getWriter());

        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(board.getSubject() + " " + board.getWriter());
        }
        System.out.println();
        for (Board b : list) {
            System.out.println(board.getSubject() + " " + board.getWriter());
        }

        list1.add(new Board("제목", "내용4", "글쓴이4"));
        //list1.add("문자열객체") E는 지금 Board이므로 다른 객체(String)는 들어가지 못함

        //모든 타입의 객체 저장(제네릭 <?>을 저장하지 않으면)
        //제네릭을 지정하지 않으면 디폴트 타입은 Object
        List list2 = new ArrayList();
        list2.add(new Board("제목", "내용5", "글쓴이5"));
        list2.add("문자열객체");
        ArrayList list3 = new ArrayList();
        list2.add(new Board("제목", "내용5", "글쓴이5"));
        list2.add("문자열객체");


    }
}
