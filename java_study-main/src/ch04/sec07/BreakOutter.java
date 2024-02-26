package ch04.sec07;

public class BreakOutter {
    public static void main(String[] args) {
        //label의 이름은 자유
        //완전히 중단하고 싶은 외부 반복문 앞에 label을 지정 (자유:)반복 중지
        Outter: for (char upper = 'A'; upper <= 'z'; upper++) {//대문자A일때 소문자a~z까지 출력됌
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "_" + lower);

                //소문자가 g일때 프로그램 종료
                if (lower =='g')break Outter;
            }
        }
    }
}