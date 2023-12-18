package ex04;

class Person4{
    //상태=변수
    private int weight = 100;

    public int getWeight(){
        return weight; //타입 int에 맞춰주기
        //메서드를 통해 간접적으로 접근
    }

    //행위=메서드
    public void exercise(){
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        System.out.println("p4의 몸무게 : "+p4.getWeight());

        for (int i = 0; i < 10; i++) {
            p4.exercise();
        }
        System.out.println("p4의 몸무게 : "+p4.getWeight());
    }
}
