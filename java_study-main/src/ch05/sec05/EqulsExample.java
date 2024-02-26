package ch05.sec05;

public class EqulsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";// 문자열 객체(홍길동이라는 데이터를 가지고 있음.)
        String strVar2 = "홍길동";
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2의 참조가 다름");

        }
        if (strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2의 문자열이 같음");
        }


        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4의 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4의 참조가 다름");

        }
        if (strVar1.equals(strVar3)){
            System.out.println("strVar1과 strVar2의 문자열이 같음");
        }
        if (strVar3 == strVar1) {//객체를 비교하는것은 주소를 비교한다
            System.out.println("strVar3과 strVar1의 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar1의 참조가 다름");

        }
    }
}
