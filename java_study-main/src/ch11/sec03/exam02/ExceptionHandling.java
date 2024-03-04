package ch11.sec03.exam02;

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] array = {"100", "100",null,"200"};

        for (int i = 0; i < array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]" + value);
            } catch (Exception e) {
                System.out.println("데이터에 문제가 있음: " + e.getMessage());
            }


        }
    }
}
