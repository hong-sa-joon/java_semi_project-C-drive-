package ch15.sec3.exam2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member>set=new HashSet<Member>();
        set.add(new Member("홍길동",30));
        set.add(new Member("홍진경",30));

        System.out.printf("총 객체 수: "+ set.size());
    }
}
