package ex04;

//설계도
public class Circle {
    private int radius;

    //생성자(생성할 때 무조건 실행되는 메서드)
    //Circle 실행 직전에 static 안 붙은 radius랑 getArea가 메모리에 뜬다.
    public Circle(int r){
        radius = r;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}
