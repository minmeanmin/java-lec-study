package ex04;

class Person2{
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");
        // 이 위는 person2가 메모리에 없다.

       Person2 p2 = new Person2(); //여기서 부터 person2 메모리에 뜬다.
        System.out.println(p2.age);
        System.out.println(p2.gender);

        System.out.println("메인 종료");
    }
}
