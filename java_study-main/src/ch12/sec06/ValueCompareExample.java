package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;

        System.out.println(obj1==obj2);//주소비교
        System.out.println(obj1.equals(obj2));//실제 값 비교
//-123 ! 127사이의 숫자는 값 자체를 비교 함(Integer, Short, Bute)
        Integer obj3=10;
        Integer obj4=10;
        System.out.println(obj3==obj4);
        System.out.println(obj3.equals(obj4));
    }
}
