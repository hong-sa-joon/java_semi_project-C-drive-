package ch05.sec07;

public class MutiDimesion2 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];//2행3열의 데이터가 만들어짐
        /*{
            {0,0,0},
            {0,0,0}
           }
             배열은 이렇지만 빈껍데기이다
        */
        //2차원 배열에 값을 할당하지 않을 경우 디폴트 값 출력
        for (int i = 0; i < mathScores.length; i++) {//행
            for (int j = 0; j < mathScores[i].length; j++) {//열
                System.out.println("mathScores[" + i + "][" + j + "]:" + mathScores[i][j]);
            }
        }

    }
}
