package ex04;

//설계도
class People{
    String name; //scope 힙
    int power;
    int hp;

    //객체 초기화
    public People(String name, int power) { // 생성자   // 여기의 매개변수 name은 stack
        this.name = name; //this를 붙이면 heap...또는 래퍼런스명.~
        this.power = power;
        this.hp = 100;
    }

    //행위
    public void upgradePower(){
        this.power++;  //heap의 power를 가리킴
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PersonEx01 {
    public static void main(String[] args) {
        People p1 = new People("티모", 10); //p1은 래퍼런스 변수
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);
    }
}
