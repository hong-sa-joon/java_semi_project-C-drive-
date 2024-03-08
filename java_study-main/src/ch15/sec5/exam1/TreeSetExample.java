package ch15.sec5.exam1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

//정렬된 Integer객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.println(s + "");
        }
        System.out.println();

        //특정 Integer 객체 가져오기
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점 바로 아래의 점수: " + scores.floor(95));
        System.out.println("95점 바로 위의 점수: " + scores.ceiling(95));

        //내림차순 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for (Integer s : descendingScores) {
            System.out.println(s + " ");
        }
        System.out.println();


        //범위 검색(80보다 큰)
        //tailSet(); 주어진 객체보다 높은 객체를 가지고 온다. 두번째 매개변수는 해당 객체를 포함하고 싶으면 true
        NavigableSet<Integer> rangset = scores.tailSet(80, true);
        for (Integer s : rangset) {
            System.out.println(s + " ");
        }
        System.out.println();
        //범위검색(80 <= score < 90)
        //subSet(feomElement.fromlnclusive,toInclusive): 시작과 끝으로 주어진 사이의 객체들을 구한다.
        rangset = scores.subSet(80, true, 90, false);
        for (Integer s : rangset){
            System.out.println(s + "");
        }
        System.out.println();


        //범위검색(87 >=)
        //headSet(toElement,inclusive):주어진 객체보다 낮은 객체를 가지고 온다.
        rangset=scores.headSet(87,true);
        for (Integer s : rangset){
            System.out.println(s+"");
        }
    }

}
