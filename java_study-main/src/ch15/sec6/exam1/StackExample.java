package ch15.sec6.exam1;

import javax.crypto.Cipher;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox=new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));


        //동전빼기
        while (!coinBox.isEmpty()){
            Coin coin=coinBox.pop();
            System.out.println("꺼낸 동전: "+coin.getValue());
        }
    }
}
