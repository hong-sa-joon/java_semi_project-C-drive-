package ch17.sec02.exam01;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {

            try {
                OutputStream os = new FileOutputStream("C:/Temp/test1.db");

                int a = 10;
                int b = 20;
                int c = 30;

                //1byte(=8byte)씩 스트림에 출력

                os.write(a);
                os.write(b);
                os.write(c);

                //내부 버퍼에 잔류하는 바이트를 출ㄺ하고 버퍼를 비움
                os.flush();

                //출력 스트림을 닫아서 메모리를 해제
                os.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

    }
}
