package ch15.sec4.exam1;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //객체저장
        map.put("김하서", 85);
        map.put("이지은", 90);
        map.put("윈터", 80);
        map.put("장발장", 95);
        map.put("더 글로리", 70);

        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        //키로 값 얻기
        int value = map.get("이지은");
        System.out.println("이지은의 점수" + value);

        value = map.get("장발장");
        System.out.println("장발장 점수:"+value);


        //모든 Entry객체를 가져와Iterator객체로 변경
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();


        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ":" + v);
        }

        System.out.println();

        map.remove("더 글로리");
        //hashMap 데이터를 모두 읽어오기
        //모든 key를 가져와 iterator객체로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ":" + v);

        }
        System.out.println();
    }
}
