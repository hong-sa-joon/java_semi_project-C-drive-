package ch03.sec01;

public class IncDecOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        // 값 자체는 전위, 후위든 증가와 감소를 한다.
        x++;
        System.out.println("x= " + x);
        ++x;
        System.out.println("x= " + x);

        y--;
        System.out.println("y= " + y);
        --y;
        System.out.println("y= " + y);

        System.out.println("==============");

        // 선대입 후증가(z에 값을 대입 후 x값을 증가시킨다.)
        z = x++;
        System.out.println("z= " + z);
        System.out.println("x= " + x);

        z = ++x;
        System.out.println("z= " + z);
        System.out.println("x= " + x);

        System.out.println("==============");

        z = ++x + y++;
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }
}
