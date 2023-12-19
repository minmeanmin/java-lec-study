package ex04.test;

public class ScopeEx01 {

    int n1 = 1;
    static int n2 = 2;

    static void m1(){
        int n5 = 10;
        System.out.println("m1 : " + n5);
    }

    void m2(){
        System.out.println("m2 : " + n1);
    }

    //메인 시작 전에 static에 n2변수와 m1메소드가 로드되어있음. m1은 이름만 올라가있지 코드 내용이 올라가있지는 않음
    public static void main(String[] args) {
        System.out.println(1);
        m1();
        System.out.println(2);
        ScopeEx01 sc = new ScopeEx01();
        System.out.println(sc.n1);
        sc.m2();
    }
}
