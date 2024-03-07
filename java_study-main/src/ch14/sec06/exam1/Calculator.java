package ch14.sec06.exam1;

public class Calculator {
    private int memory;
    public int getMemory(){
        return memory;
    }
    public void setMemory1(int memory) throws InterruptedException {
        synchronized (this){

        this.memory=memory;
        Thread.sleep(2000);
        //실행되고있는 스레드의 이름과 memory 필드 값 출력
        System.out.println(Thread.currentThread().getName()+":"+this.memory);
        }
    }
    public void setMemory2(int memory) throws InterruptedException {
        synchronized (this){

    this.memory=memory;
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+":"+this.getMemory());
        }
//스레드->병렬 관련 : 동기->순서관련
    }

}
