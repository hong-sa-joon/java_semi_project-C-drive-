package ch14.sec05.exam2;

public class SumThread extends Thread{
private long sum;


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            sum +=i;
        }
    }
    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
