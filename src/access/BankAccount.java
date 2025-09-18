package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //입금
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액");
        }
    }

    //검증
    //내부에서만 사용하기 때문에 private
    private boolean isAmountValid(int amount){
        //금액이 0보다 커야함
        return amount > 0;
    }

    //출금
    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액 or 잔액 부족");
        }
    }

    //잔액
    public int getBalance() {
        return balance;
    }
}