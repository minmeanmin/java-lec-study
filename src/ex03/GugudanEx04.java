package ex03;

class GugudanUtil{
    static void gugudan(int x){
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
        System.out.println();
    }
}

public class GugudanEx04 {

    public static void main(String[] args) {
        //GugudanUtil 클래스에 gugudan 정적 메소드를 호출하시오.
        //Parameter는 int 한 개가 필요합니다.
        GugudanUtil.gugudan(10);
    }
}