package ch02.sec10;

public class StringConvarExample {
    public static void main(String[] args) {
        //문자열을 숫자열로 변환(parse)
        String str = "10";
        int value1 = Integer.parseInt(str);//정수
        double value2 = Double.parseDouble(str);//실수
        boolean value3 = Boolean.parseBoolean("true");//문자열이면 true boolean:참,거짓
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);


//        숫자열을 문자열로 변환(String.valueOf)
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    }
}
