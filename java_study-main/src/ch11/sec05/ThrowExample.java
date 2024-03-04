package ch11.sec05;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            findClass();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void findClass() throws ClassNotFoundException {

        Class.forName("java.lang.String2");
    }
}
