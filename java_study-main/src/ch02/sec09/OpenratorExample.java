package ch02.sec09;

public class OpenratorExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;//컴파일 단계에서 연상을 수행하므로 byte result1 = 30;과 같다
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;//실행시 자동타입 변환(v -> int)이 된다 변환후 연산자가 실행된다.
        byte result3 = (byte) (v1 + v2);//강제 타입 변환(byte)
        //변환 되는 타입의 요량이 클시 해결법은
        // 같은 타입으로 맞추거나 강제 타입 변환을 사용한다.
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result4 = v3 + v4 + v5;// ★셋중 가장 값의 혀용번위가 가장 큰 타입으로 변환 된다.(long으로 변환)
        System.out.println("result4: " + result4);

        float f1 = 1.2f;
        double d1 = 3.4;
        double result5 = f1 + d1;//double 타입으로 변환 후 연산 됨 -> 실수끼리 연산도 혀용범위가 큰 타입으로 변환
        System.out.println("result5: " + result5);


        //실수,정수
        int v9 = 10;

        //자바에서는 실수 리터럴을 double타입으로 인식하므로 4.0은 double타입이다.
        double result6 = v9 / 4.0;//v9는 실수타입(double)으로 변환 후 연산 됨
        float result7 = v9 / 4.0f;//v9는 실수타입(float)으로 변환 후 연산 됨
        System.out.println("result6: " + result6);

        //char와 int의 연삭
        char v6 = 'A';
        char v7 = 1;
        int result8 = v6 + v7;//int타입으로 변환 후 연산됨
        System.out.println("result8: " + result8);
        System.out.println("result8: " + (char) result8);//char타입 강제타입변환 시킨 후 출력

        int x = 1;
        int y = 2;
//      ★정수 연산의 결과는 항상 정수 -> 결과 값인 0.5에서 소수점을 버린다 (값은 0)
        double result = x / y;//0을 double타입 변수에 저장하므로 0.0이 출력된다
        System.out.println("result: " + result);


//          0.5를 얻기위한 방법 1.
//        double result9=x / (double)y;//x나 y중 하나를 실수로 타입 변환을 시키면 0.5가 나온다.
//        System.out.println("result9: "+ result9);


//          0.5를 얻기위한 방법 2.
//        double result9=(double)x / y;//x나 y중 하나를 실수로 타입 변환을 시키면 0.5가 나온다.
//        System.out.println("result9: "+ result9);

//          0.5를 얻기위한 방법 3.
        double result9 = (double) x / (double) y;//둘 다 실수로 타입 변환을 시키면 0.5가 나온다.
        System.out.println("result9: " + result9);


    }
}
