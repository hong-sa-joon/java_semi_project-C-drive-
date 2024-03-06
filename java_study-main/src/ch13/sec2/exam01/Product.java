package ch13.sec2.exam01;

public class Product<K, M> {
    private K kind;//Tv,Car타입 지정
    private M model;//String타입 지정

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
