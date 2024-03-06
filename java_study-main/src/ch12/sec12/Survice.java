package ch12.sec12;

public class Survice {
    @PrintAnnotation
public void method1(){}
    @PrintAnnotation("*")
public void method2(){}
    @PrintAnnotation(value = "#",number = 20)
public void method3(){}
}
