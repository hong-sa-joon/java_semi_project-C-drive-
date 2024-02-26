package ch08.sec07;

public interface Service {
    //default 메소드 작성
    default void defaultMethod1(){
        System.out.println("defalutMethod1() 메소드");
        defalutCommon();
    }
    default void defaultMethod2(){
        System.out.println("defalutMethod2() 메소드");
        defalutCommon();
    }
    //인터페이스에 private 메소드 작성
    private void defalutCommon(){
        System.out.println("defalutCommon() 메소드");

    }

    //정적메소드
    static void staticMethod1(){
        System.out.println("staticMethod1() 메소드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2() 메소드");
        staticCommon();
    }



    //인터페이스 안 다른 메소드에서 가져다 쓰기 위해 많이 사용(중복된 코드 줄음)
    //static메소드 안에서는 static메소드만 호출 가능하므로 static키워드 사용
    private static void staticCommon(){
        System.out.println("staticCommon() 메소드");
    }
}
