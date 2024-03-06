package ch12.sec11.exam03;

public class GetResurceExample {
    public static void main(String[] args) {
Class clazz=Car.class;
//Car 클래스에 동인한 위치에 있는 경로
String photoPath=clazz.getResource("photo1.jpg").getPath();
        System.out.println(photoPath);
        //Car클래와 같이 있는 다른패키지 경로
        String photo2Path=clazz.getResource("images/photo2.jpg").getPath();
        System.out.println(photo2Path);
    }
}
