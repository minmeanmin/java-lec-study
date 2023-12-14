package ex02.Programming;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("오렌지의 개수를 입력하시오: ");
        int num = sc.nextInt();
        int box = num / 10;
        int last = num % 10;
        System.out.println(box + "박스가 필요하고 " + last + "개가 남습니다.");
    }
}
