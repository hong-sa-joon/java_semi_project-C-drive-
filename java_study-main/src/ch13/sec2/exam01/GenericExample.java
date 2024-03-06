package ch13.sec2.exam01;

import ch08.sec10.exam01.C;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product</*생략가능*/>();
        product1.setKind(new Tv());
        //K를 Tv타입으로 지정했기 때문에 Tv객체 set
        product1.setModel("스마트 Tv");
        Tv tv = product1.getKind();
        String str = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");
        Car car = product2.getKind();
        String carmodel = product2.getModel();


    }
}
