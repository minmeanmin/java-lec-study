package ex05;

public class PizzaTest02 {
    public static void main(String[] args) {
        Pizza02 p1 = new Pizza02("Super Supreme");
        Pizza02 p2 = new Pizza02("Cheese");
        Pizza02 p3 = new Pizza02("Pepperoni");
        int n = Pizza02.count;
        System.out.println("지금까지 판매된 피자 개수 = " + n);
    }
}