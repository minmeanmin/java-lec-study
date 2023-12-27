package ex06.example7;

public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본버거", 1000); //[Burger]
        Burger b2 = new ShrimpBurger("새우버거", 2000, "새우"); //[Burger, ShrimpBuger]
        Coke c1 = new Coke("콜라", 1000);
        System.out.println();
        BurgerSet set =
                new BurgerSet(
                    new Burger("기본버거", 1000),
                    new Coke("콜라", 1000)
                );
        System.out.println("총 가격은 : " + set.getTotalPrice());
//        System.out.println(set.getBurger().getPrice());
//        System.out.println(set.getCoke().getPrice());
    }
}
