package ch06.sec08.exam02;

public class Computer {
    //메소드
    int sum(int ... values){
        int sum=0;

        for (int i = 0; i < values.length; i++) {
            //SOUT은 return문을 만나면 실행 되지 않으므로 위에 적는다
            System.out.println("["+i+"]"+values[i]);
            sum += values[i];
        }
        return sum;//종료
    }
}
