package ch17.sec03.exam02;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/Temp/test2.db");
            byte[] data = new byte[3];
            while (true) {
                int num = is.read(data);//데이터를 3byte씩 배열 형태로 읽어온다.
                System.out.println("num: " + num);

                if (num == -1) break;//파일 끝에 도달 시

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);

                }


            }
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
