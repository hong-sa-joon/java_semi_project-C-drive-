package ch07.sec03.exam01;

import ch06.sec12.hankook.SnowTire;

public class SmartPhone extends Phone{
public SmartPhone(String model,String color){
super();//부모객체의 생성자를 실행해준다(생략가능): 생략하면 컴파일 시 자동 추가됨
this.model=model;
this.color=color;
        System.out.println("SmartPhone(String model,String color) 생성자 실행");
    }
}
