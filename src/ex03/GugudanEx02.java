package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("몇단을 출력할까요? : ");
        int num = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.print(num + "*" + i + "=" + num * i + "\t");

        }
    }
}