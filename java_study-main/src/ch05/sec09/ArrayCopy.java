package ch05.sec09;

public class ArrayCopy {
    public static void main(String[] args) {
        //배열의 길이가 3에서 5로 바꾸기
        int[] oldIntArray={1,2,3};//length: 3
        //oldIntArray[3]=4;//에러 발생 배열이3인데 4를 주었기에 범위를 벗어남
        int[] newIntArray=new int[5];//length: 5
        //배열 항목 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i]=oldIntArray[i];
        }

        //배열 항목 출력(배열은 참조타입 주소를 가지고 있기에 주소가 출력된다(데이터 출력해야함))
        for (int i = 0; i < newIntArray.length; i++) {

        System.out.println(newIntArray[i]);
        }
    }
}
