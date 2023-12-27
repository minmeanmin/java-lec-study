package ex06.example7;

public class BurgerSet { //has Burger, Coke
    private Burger burger; // 필요한 객체를 상태로 적기
    private Coke coke; // 필요한 객체를 상태로 적기

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요");
    }

    public int getTotalPrice(){
        int total = burger.getPrice() + coke.getPrice();
        return total;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
