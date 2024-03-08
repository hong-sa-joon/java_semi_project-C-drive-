package ch15.sec3.exam2;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        //name과age의 값이 같으면 동일한 hashcode가 리턴 됨
        return name.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target){//object obj=new Member();자동타입변환
            //객체의 데이터를 비교
            //name과age값이 같으면 true를 리턴
        return target.name.equals(name)&&(target.age==age);
        }else {
            return false;
        }
        //equals는 기본적으로 객체의 주소 비교를 함
        //인스턴트는 오브젝트와 멤버를 타겟
    }
}
