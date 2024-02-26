package ch07.sec09;

import ch06.sec12.hankook.SnowTire;

public class Student extends Person {
    public int studentNo;

    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    public void study() {
        System.out.println("공부를 합니다.");
    }


}
