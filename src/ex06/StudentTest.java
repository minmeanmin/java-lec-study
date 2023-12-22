package ex06;

class Person{
    private String regnumer;
    private double weight;
    protected int age;
    String name;

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}

class Student extends Person{
    int id;
}

public class StudentTest {
    public static void main(String[] args) {
        Student obj = new Student();
        //obj.regnumber = "123456-123456";
        //obj.weight = 75.0;
        obj.age = 21;
        obj.name = "Kim";
        obj.setWeight(75.0);
    }
}
