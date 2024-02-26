package ch05.sec06;

public class ArrayCreate {
    public static void main(String[] args) {
        //배열의 선언(첫번째 방법)많이씀
        int[] intArray = {1,2,3};
        double[]doubleArray=new double[]{0.1,0.2,3,4};
        //데이터 5개를 저장 할 수 있는 배열을 선언(값을 할당하지 않음)
        int[] intArray3=new int[5];

        //배열의선언(두번째 방법)
        int intArray2[]= {1,2,3};
        double doubleArray2[]={1,2};
        String season2[]={"봄","여름","가을","겨울"};

        String[]season={"봄","여름","가을","겨울"};
        //배열의 값 읽기
        System.out.println(season[0]);
        System.out.println(season[1]);
        System.out.println(season[2]);
        System.out.println(season[3]);

        //배열의 값 수정
        season[1]= "summer";
        System.out.println("바꾼값: "+ season[1]);

        int[] scores = {83,90,87};

        //총합 구하기
        int sum = 0;
        for (int i = 0; i < scores.length ; i++) {
                sum += scores[i];//합계

        }
        //평균 구하기
        double avg =(double) sum/ scores.length;
        System.out.println("총합: "+sum+"평균: "+avg);


        //배열 선언 후 값 할당 하는법
        String[] season3;
        season3 = new String[]{"봄","여름"};

        int[]arr;
        arr=new int[]{1,3};
    }
}
