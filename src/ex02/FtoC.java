package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        double fTemp, cTemp;
        System.out.println("===============================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("===============================");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 선택하시오: ");
        int num = sc.nextInt();
        if(num==1){
            // 1. 화씨 온도 받기
            System.out.print("화씨온도를 입력하시오: ");
            fTemp = sc.nextDouble();

            // 2. 화씨 -> 섭씨 온도로 변환
            cTemp = (fTemp-32) * 5.0 / 9.0 ;
            System.out.print("섭씨 온도는 " + cTemp);
        }else {
            // 1. 섭씨 온도 받기
            System.out.print("섭씨온도를 입력하시오: ");
            cTemp = sc.nextDouble();
            // 2. 섭씨 -> 화씨 온도로 변환
            fTemp = cTemp * 9.0 / 5.0 + 32;
            System.out.print("화씨 온도는 " + fTemp);
        }
        /*   삼항 연산자로 문제 해결하기
         *
         *         System.out.println("==============================");
         *         System.out.println("1. 화씨->섭씨");
         *         System.out.println("2. 섭씨->화씨");
         *         System.out.println("==============================");
         *         System.out.println(" ");
         *
         *         Scanner sc = new Scanner(System.in);
         *         System.out.print("번호를 선택하시오: ");
         *         int num = sc.nextInt();
         *         System.out.print((num==1) ? "화씨온도를 입력하시오: ": "섭씨온도를 입력하시오: ");
         *         double temp = sc.nextDouble();
         *         System.out.print((num==1) ? "섭씨온도는 ": "화씨온도는 ");
         *         System.out.print((num==1) ? (temp-32) * 5 /9 : temp * 9 / 5 +32 );
         */
    }
}
