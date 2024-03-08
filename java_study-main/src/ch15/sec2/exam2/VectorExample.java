package ch15.sec2.exam2;

import ch15.sec2.exam1.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
        //List<Board>list=new Vector<Board>();
        List<Board>list=new ArrayList<>();

        Thread thread1=new Thread(){
            @Override
            public void run() {
                //1000개의 board객체 add
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                //1000개의 board객체 add
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };

        //스레드 실행
        thread1.start();
        thread2.start();


        //다른 작업 스레드가 모두 종료될 때까지 메인스레드를 기다리게 함.
        thread1.join();
        thread2.join();
//메인->스레드3개 실행->start실행은하는데 대기상태->join을 만나면 해당 위치의 스레드를 일시정지시킴->대기상태의 스레드가 실행후 메인스레드 실행
//        thread1,thread2의 작업이 완료된 후 메인스레드 다시 실행
        int size= list.size();
        System.out.println("총 객체 수: "+ size);




    }
}
