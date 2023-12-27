package ex08;

import java.security.spec.RSAOtherPrimeInfo;

class Account { //원래는 class Account extends Object인데 평소에는 생략된 것
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account.getClass());
        System.out.println(account.hashCode()); //메모리 검증할 때 hashCode 사용

        //메모리 값 비교(주소 비교)
        if(account == account2){//new를 두번해서 다르기 때문
            System.out.println("같음");
        }

        //account -> equals() (오브젝트) (주소비교)
        //account.toString -> equals() (주소비교 and 값 비교)
        if(account.toString().equals(account2.toString())){
            System.out.println("같음");
        }
    }
}
