package ex06;

class Person01{
    String name;
    public Person01(){ }
    public Person01(String theName) { this.name = theName; }
}

class Employees extends Person01{
    String id;
    public Employees() { super(); }
    public Employees(String name) { super(name); }
    public Employees(String name, String id){
        super(name);
        this.id = id;
    }

    @Override
    public String toString(){
        return "Employees [id=" + id + " name=" + name + "]";
    }
}

public class Employee {
    public static void main(String[] args) {
        Employees e = new Employees("Kim", "20210001");
        System.out.println(e);
    }
}
