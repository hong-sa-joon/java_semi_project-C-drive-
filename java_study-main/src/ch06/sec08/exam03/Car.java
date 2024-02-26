package ch06.sec08.exam03;

public class Car {
    //필드
    int gas;//기름양

    //메소드
    //1.기름주유
    void setGas(int gas) {
        //필드의 변수와 매개변수의 이름이 같을 때 this사용
        this.gas = gas;
    }

    //2.기름 유무
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("기름이 없습니다.");
            return false;
        } else {
            System.out.println("기름이 있습니다.");
            return true;
        }
    }

    //3.기름 소진량
    void run() {

        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량: " + gas + ")");
                //차가 달릴때마다 기름소진(1)
                gas = gas - 1;
            } else {//기름이 없으면 실행
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;//void 메소드를 종료시키고 싶을 때 사용
            }
        }
    }


}
