package ch12.sec11.exam02;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        System.out.println("생성자 정보");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName()+"(");
            //생성자에 사용된 모든 파라메터를 가져옴
            Class[] parameters=constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName()+" "+field.getName());
        }
        System.out.println("메소드 정보");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName()+"(");
            Class[] parameters=method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }


    }

    //파라미터(매게변수) 출력
    private static void printParameters(Class[] paramerters) {
        for (int i = 0; i < paramerters.length; i++) {

            System.out.print(paramerters[i].getName());

            //파라메터가 2개 이상일 떄 콤마를 찍어준다.
            if (i < (paramerters.length + 1)) {
                System.out.print(",");
            }
        }
    }
}
