package ex01;

public class VarEx01 {

    //모든 코드는 main 매서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 21억까지 (4Byte=4칸)
        double d1 = 1.5; // 21억까지 (8Byte=8칸)
        long big1 = 20000000000L; // 경까지 (8Byte=8칸) // 지금까지 입력한 코드 바이트 계산하면 20Byte 사용
        boolean b1 = true; // true, false
        char c1 = 'a'; // 영어, 한글 한 글자씩 가능

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    } // 자바 프로그램 종료
}