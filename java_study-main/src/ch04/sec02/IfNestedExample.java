package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        /*
         * 랜덤한 숫자를 구하는 곧식
         * start부터 n개의 정수를 핸덤한 숫자로 구한다.
         * (int)(Math.random()*n)+start*/
        int score = (int) (Math.random() * 20) + 81;//81부터 100까지의 랜덤한 숫자를 구한다.
        System.out.println("랜덤한 점수 : " + score);

        String grade;

        if (score >= 90) {
            if (score >= 95) grade = "A+";
            else grade = "A";
        } else {
            if (score >= 85) grade = "B+";
            else grade = "B";
        }
        System.out.println("학점 : "+ grade);
    }

}
