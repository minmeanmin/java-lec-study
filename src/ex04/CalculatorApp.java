package ex04;

//add, minus, divide(나누기), multi(곱하기)
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int result1 = cal.add(50,25);
        System.out.println("add : "+result1);

        int result2 = cal.minus(50,25);
        System.out.println("minus : "+result2);

        int result3 = cal.divide(50,25);
        System.out.println("divide : "+result3);

        int result4 = cal.multi(50,25);
        System.out.println("multi : "+result4);
    }
}
