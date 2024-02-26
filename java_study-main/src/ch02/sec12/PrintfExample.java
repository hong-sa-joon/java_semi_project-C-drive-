package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
//        System.out.printf("이름: %s, 나이: %d, 일자 : %d일","홍사준",27,10);
// %s = 문자열 %d= 숫자열
//        값의 순서를 바꾸고 싶으면 숫자$를 %뒤에 쓴다, 숫자는 문자열과 숫자의 순서

        int value = 123;
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: %6d원\n", value);//정수 6자리의 수를 만든다(6d),좌측 공백
        System.out.printf("상품의 가격: %-6d원\n", value);//정수 6자리의 수를 만든다(-6d)우측 공백
        System.out.printf("상품의 가격: %06d원\n", value);//정수 6자리의 수를 만든다(-6d)좌측 공백에 0으로 채움

        double area = 3.14159 * 10 * 10;
        //실수의 앞에는 %를 붙인다 10은 10자릿수 2는 소수점자릿수 두자리나타냄  소수점2자리+.+정수7자리=10자리,왼쪽 공백
        System.out.printf("반지름의  %d인 원의 넓이: %10.2f\n", 10, area);
        //정수7자리 + 소수점 + 소수2자리=총10자리, 오른쪽 공백
        System.out.printf("반지름의  %d인 원의 넓이: %-10.2f\n", 10, area);
        //정수7자리 + 소수점 + 소수2자리=총10자리, 왼쪽 공백 0으로 채움
        System.out.printf("반지름의  %d인 원의 넓이: %010.2f\n", 10, area);

        String name = "이지은";
        String job = "가수";
        //6자리 문자열 부족한 문자열은 공백으로 적용6은 왼쪽 공백  -6은 오른쪽 공백
        System.out.printf("%6s|%-6s", name, job);
    }
}
