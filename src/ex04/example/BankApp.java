package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        //1. 고객 3명 만들기
        User min = new User(1, "min", "min@naver.com");
        User yun = new User(2, "yun", "yun@naver.com");
        User won = new User(3, "won", "won@naver.com");

        //2. 계좌 3개 만들기
        Account minAccount = new Account(1111, 1000L, 1);
        Account yunAccount = new Account(2222, 1000L, 2);
        Account wonAccount = new Account(3333, 1000L, 3);

        //3. 고객에게 정보를 받기 (sender, receiver, amount)
        long amount = 100L;

        //4. 이체 (yun -> min 100원)
        BankService.이체(yunAccount, minAccount, amount);

        //5. 이체 (min -> won 100원)
        BankService.이체(minAccount, wonAccount, amount);

        //6. 이체 (yun -> won 100원)
        BankService.이체(yunAccount, wonAccount, amount);

        //7. 객체 상태 확인
        System.out.println(minAccount);
        System.out.println(yunAccount);
        System.out.println(wonAccount);

        //8. 출금
        BankService.출금(minAccount, amount);
    }
}