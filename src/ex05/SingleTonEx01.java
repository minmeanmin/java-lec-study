package ex05;

class President{
    static President instance = new President(); //메인 실행 전에 힙에 뜬다.

    private President() {}
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance; //static이니까 클래스명.을 통해 접근
        System.out.println(p1.hashCode());

        President p2 = President.instance; //static이니까 클래스명.을 통해 접근
        System.out.println(p2.hashCode());
    }
}
