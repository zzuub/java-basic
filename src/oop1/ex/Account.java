package oop1.ex;

public class Account {
    // 잔액 전역변수
    int balance;

    // return을 안 함
    void deposit(int amount){
        balance += amount;
    }

    // amount 출금금액
    void withdraw(int amount){
        // 잔액 >= 출금금액 -> 출금 = 잔액 - 출금금액
        if(balance >= amount){
            balance -= amount;
        }else{
            // 잔액 < 출금금액 -> 잔액 그대로, "잔액 부족" 출력
            System.out.println("잔액부족");
        }
    }

}
