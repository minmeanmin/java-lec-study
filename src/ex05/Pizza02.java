package ex05;

public class Pizza02 {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public Pizza02(String toppings){
        this.toppings = toppings;
        count++;
    }
}