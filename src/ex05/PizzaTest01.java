package ex05;

class Pizza01{
    int radius;

    Pizza01(int r){
        radius = r;
    }
    Pizza01 whosLargest(Pizza01 p1, Pizza01 p2){
        if(p1.radius > p2.radius)
            return p1;
        else
            return p2;
    }
}

public class PizzaTest01 {
    public static void main(String[] args) {
        Pizza01 obj1 = new Pizza01(14);
        Pizza01 obj2 = new Pizza01(18);

        Pizza01 largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼.");
    }
}
