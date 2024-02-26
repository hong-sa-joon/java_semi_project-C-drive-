package ch06.sec08.exam04;

public class Calculator {
    //정사각형의 너비 구하는 메소드
    double areaRectangle(double width){
        return width*width;
    }
    //메소드 오버로딩
//    메소드의 이름은 동일해야한다.
    //직사각형의 너비 구하는 메소드
    double areaRectangle(double width, double height){
        return width*height;
    }


}
