package ex06;

class Shape01{
    int x, y;

    public Shape01(){
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape01{ //Circle은 Shape의 자식
    int radius;

    public Circle(int radius){
        System.out.println("Circle 생성됨");
        this.radius = radius;
        System.out.println("1");
        super.x=0;
        super.y=0;
    }

    double getArea(){
        return 3.14*radius*radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getArea();
        System.out.println("원의 중심: ("+circle.x+ ","+circle.y+")");
        System.out.println("원의 면적: " + circle.getArea());
    }
}
